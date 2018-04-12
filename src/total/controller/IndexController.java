package total.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"/", "/index"})
	public String indexHandler(Model model) {
		
		model.addAttribute("msg","Hello!");
		return "index";
		
	}
}
