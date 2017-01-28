package com.lepsec.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by jonatannietoa on 19/06/2016.
 */
@RestController
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index() {
        try {
            return "Spring Dockerized App v2.0 (Heroku CI and deploy), the host name is: " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            if (logger.isErrorEnabled()){
                logger.error("Index request error", e.getMessage());
            }
            return e.getMessage();
        }
    }
}
