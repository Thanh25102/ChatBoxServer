package com.buimanhthanh.chatboxserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Principal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Principal {
    private String name;
    private String avatar;
}
