package com.example.demo.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SomeService;

@RestController
public class RestMainController {

	private static final Logger LOG = LoggerFactory.getLogger(RestMainController.class);

	@Autowired
	SomeService someService;

	@RequestMapping(value = "/ping")
	public String ping() {
		LOG.info("ping pong");
		return "pong";
	}
	
	@RequestMapping(value = "/callback")
	public String callback(HttpServletRequest request) {
		LOG.info("ping pong");
		
		Enumeration<String> headers = request.getHeaderNames();
		LOG.info("headers ----------");
		while (headers.hasMoreElements()) {
			String headerKey = headers.nextElement();
			LOG.info("key={}, value={}", headerKey, request.getHeader(headerKey));
		}
		LOG.info("params ----------");
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String paramKey = params.nextElement();
			LOG.info("key={}, value={}", paramKey, request.getParameter(paramKey));
		}
		return "pong";
	}

}
