package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SomeService.class);

	@Override
	public void testJob() {
		LOG.info("SomeServiceImpl.testJob called.");
	}

}
