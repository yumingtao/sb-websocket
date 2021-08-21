package com.ymt.sample.websocket.controller;

import com.ymt.sample.websocket.dto.Greeting;
import com.ymt.sample.websocket.dto.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import java.util.concurrent.TimeUnit;

/**
 * Description
 *
 * @author yumingtao
 * @date 2021/8/20 22:06
 */
@RestController
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return Greeting.builder()
                .content("Hello, " + HtmlUtils.htmlEscape(helloMessage.getName()) + "!")
                .build();
    }
}
