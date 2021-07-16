package com.example.demo.service;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeServiceImpl implements SomeService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SomeService.class);
	
	private static final String POST_AUTHORIZE_URL = "https://nid.naver.com/oauth2.0/authorize";
	
	private RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public void testJob() {
		LOG.info("SomeServiceImpl.testJob called.");
	}

	@Override
	public void authorize() {
		LOG.info("SomeServiceImpl.authorize called.");
		
		SecureRandom random = new SecureRandom();
		String state = new BigInteger(130, random).toString();
		
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		parameters.add("response_type", "code");
		parameters.add("client_id", "xJmqq2oMq8o0a9FVA67q");
		parameters.add("redirect_uri", "http://49.247.196.165:8090/callback");
		parameters.add("state", state);
		
		          
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(parameters, headers);

		ResponseEntity<String> response;
		String resBody;
		
		try {
			response = restTemplate.exchange(POST_AUTHORIZE_URL, HttpMethod.POST, entity, String.class);
			resBody = response.getBody();
			LOG.info("authorize resBody. [{}]", resBody);
		} catch (RestClientResponseException e) { // TODO 보기좋게 만들기. 뒤처리 고민하기.
			int status = e.getRawStatusCode();
			String statusTxt = e.getStatusText();
			String body = e.getResponseBodyAsString();
			LOG.error("authorize status. [{}, {}]", status, statusTxt);
			LOG.error("authorize body. {}", body);
		} catch (Exception e) {
			LOG.error("authorize fail. {}", e.getMessage());
		}
	}
}
