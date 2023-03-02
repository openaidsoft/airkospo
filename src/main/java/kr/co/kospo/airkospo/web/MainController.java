package kr.co.kospo.airkospo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(Model model) {
		System.out.println("/");
		model.addAttribute("test", "루트");
		return "index";
	}
	
	@GetMapping("/density")
	public String density(Model model) {
		System.out.println("/density");
		model.addAttribute("test", "대기배출농도");
		return "density/index";
	}
	
	@GetMapping("/around")
	public String around(Model model) {
		System.out.println("/around");
		model.addAttribute("test", "주변환경농도");
		return "around/index";
	}
	
	@GetMapping("/discharge")
	public String discharge(Model model) {
		System.out.println("/discharge");
		model.addAttribute("test", "대기배출량");
		return "discharge/index";
	}
}
