package com.example.demo.service;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeServiceImpl implements SomeService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SomeService.class);
	
	private static final String POST_AUTHORIZE_URL = "https://nid.naver.com/oauth2.0/authorize";
	
	private RestTemplate restTemplate;
	
	private String clientId;
	
	private String redirectUri;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Value("${naver.id.login.client.id}")
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	@Value("${naver.id.login.redirect.uri}")
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	@Override
	public void testJob() {
		LOG.info("SomeServiceImpl.testJob called.");
	}

	@Override
	public String authorize() {
		LOG.info("SomeServiceImpl.authorize called.");
		
		SecureRandom random = new SecureRandom();
		String state = new BigInteger(130, random).toString();
		
		
//		String clientId = "YOUR_CLIENT_ID";//애플리케이션 클라이언트 아이디값";
		try {
			String redirectURI = URLEncoder.encode(redirectUri, "UTF-8");
			String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
		    apiURL += "&client_id=" + clientId;
		    apiURL += "&redirect_uri=" + redirectURI;
		    apiURL += "&state=" + state;
		    
		    return apiURL;
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return null;
		
		/*
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		parameters.add("response_type", "code");
		parameters.add("client_id", clientId);
		parameters.add("redirect_uri", redirectUri);
		parameters.add("state", state);
		
		          
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(parameters, headers);

		ResponseEntity<String> response;
		String resBody = "";
		
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
		
		return resBody;
		*/
	}
}
