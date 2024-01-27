package jpa.practice.ver1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasicController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/add")
	public String addForm() {
		return "add";
	}
	
	@GetMapping("/list")
	public String list() {
		return "list";
	}
	
	@PostMapping("/add")
	public String add() {
		return "redirect:/";
	}
	
}
