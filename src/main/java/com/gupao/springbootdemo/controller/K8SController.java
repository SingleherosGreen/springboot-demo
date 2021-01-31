package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {
    String result = "";
    @RequestMapping("/k8s")
    public String k8s(){
        try {
            InetAddress address = InetAddress.getLocalHost();
            result = "hostname:" + address.getHostName() + " hostaddress:" + address.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "hello K8s <br/>" + result;
    }
}
