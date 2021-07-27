package com.example.demo.config;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
        return restTemplate;
    }
    
    public CloseableHttpClient httpClient() {
        RequestConfig requestConf = RequestConfig.custom()
                .setConnectTimeout(500)
                .setSocketTimeout(2000)
                .build();
        
        return HttpClients.custom().setDefaultRequestConfig(requestConf)
                .setMaxConnTotal(10)
                .setMaxConnPerRoute(5)
                .build();
    }
    
    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        clientHttpRequestFactory.setHttpClient(httpClient());
        return clientHttpRequestFactory;
    }
}
