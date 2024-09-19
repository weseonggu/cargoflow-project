package com.spring_cloud.eureka.client.order.application.exception.exceptionsdefined;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DoNotCheckOterDataEception extends RuntimeException {
    public DoNotCheckOterDataEception(String msg) {
        super(msg);
    }
}