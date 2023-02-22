package kr.co.kospo.airkospo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page3Controller {

	@GetMapping("/menu3")
	public String home(Model model) {
		model.addAttribute("test", "테스트 값");
		return "emissions";
	}
}
