package com.buimanhthanh.chatboxserver.controller;

import com.buimanhthanh.chatboxserver.entity.ChatPrivate;
import com.buimanhthanh.chatboxserver.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @Autowired
    private SimpMessagingTemplate simpMessage;

    @MessageMapping("/common")
    @SendTo("/topic/common")
    public Message chatCommon(Message message) throws Exception {
        return message;
    }

    @MessageMapping("/specific-user")
    public Message chatPrivate(ChatPrivate chatPrivate) {
        simpMessage.convertAndSendToUser(chatPrivate.getUser().getName(), "/queue/private", chatPrivate.getMessage());
        return chatPrivate.getMessage();
    }

}
