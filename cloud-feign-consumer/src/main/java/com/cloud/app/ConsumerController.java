package com.cloud.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return clientService.add(11,33);
    }
}