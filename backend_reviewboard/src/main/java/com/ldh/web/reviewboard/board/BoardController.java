package com.ldh.web.reviewboard.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping(path="/home")
	public void homepage() {
		System.out.println("Hello");
//		return "hello";
	}
}
