package com.tg.cloud.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，from "+ port+ " this is new world";
    }

    @GetMapping("/sayHello")
    public JSONObject sayHello(@RequestParam String name) {
        JSONObject jsonObject = new JSONObject();
        String data = "hello "+name+"，from "+ port+ " this is new world";
        jsonObject.put("data",data);
        return jsonObject;
    }

}
