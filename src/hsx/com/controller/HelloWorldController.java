package hsx.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
     
	@RequestMapping("/helloWorld")  //«Î«Û”≥…‰
	public String helloWorld(Model model){
		model.addAttribute("message", "StringMVCƒ„∫√ƒ„∫√£°");
		return "helloWorld";
	}
}
