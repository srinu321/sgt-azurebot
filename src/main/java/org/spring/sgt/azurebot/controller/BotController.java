package org.spring.sgt.azurebot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BotController{
	@GetMapping("/chat")
	public String bot() {
		return "Hi,Your first chatBot appilcation";
	}
    
}





