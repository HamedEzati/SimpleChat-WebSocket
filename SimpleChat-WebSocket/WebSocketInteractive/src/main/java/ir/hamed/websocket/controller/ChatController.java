package ir.hamed.websocket.controller;

import ir.hamed.websocket.message.MessageToAll;
import ir.hamed.websocket.message.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public MessageToAll chat(Message message) throws InterruptedException {
        Thread.sleep(1000);
        return new MessageToAll(HtmlUtils.htmlEscape(message.getMessage()));
    }

}
