package example.controller;

import example.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetRestController {

    @Autowired
    WelcomeFeignClient welcomeClient;

    @GetMapping("/greet")
    public String getGreetMsg() {
        String welcomeMsg = welcomeClient.getWelcome();
        String greetMsg = "Greet !!! ";
        return greetMsg + welcomeMsg;
    }
}
