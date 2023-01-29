package com.buimanhthanh.chatboxserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatPrivate {
    private User user;
    private Message message;
}
