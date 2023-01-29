package com.buimanhthanh.chatboxserver.controller;

import com.buimanhthanh.chatboxserver.entity.Message;
import com.buimanhthanh.chatboxserver.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/api")
public class RestUser {

    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(new User("Thanh","manhthanh.jpg"), new User("Ngoc","ngoc.jpg"), new User("Nghi","nghi.jpg"));
    }

}
