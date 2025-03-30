package com.gyakorlas.demo.kafka;

import com.gyakorlas.demo.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    private final KafkaTemplate<String, UserDto> template;

    public UserProducer(KafkaTemplate<String, UserDto> template){
        this.template = template;
    }

    public void send(UserDto user){
        template.send("users-topic",user);
    }

}
