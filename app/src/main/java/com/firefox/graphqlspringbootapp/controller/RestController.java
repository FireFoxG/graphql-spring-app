package com.firefox.graphqlspringbootapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(path = "order", method = RequestMethod.GET)
    public List getOrder() {
        return Collections.singletonList("abcd");
    }
}
