package com.example.shippingservice.service;

import com.example.shippingservice.entity.Shiper;
import com.example.shippingservice.repository.RepositoryShiper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Service

public class UserService {
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private Logger logger = LoggerFactory.getLogger(UserService.class);
//
//    @Value("${app.url.users}")
//    private String URL;
//
//    public Collection<Shiper> findAll(){
//        ResponseEntity<CollectionModel<Shiper>> r = restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<CollectionModel<User>>() {
//        });
//        return r.getBody().getContent();
//    }
}
