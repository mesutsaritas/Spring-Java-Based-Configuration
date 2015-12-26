package tr.com.mesutsaritas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mesut.saritas
 *
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("hello", "Hello World");
		 return "welcome";

	}

	@RequestMapping(value = "/helloAgain", method = RequestMethod.GET)
	public String printHelloAgain(ModelMap model) {
		model.addAttribute("hello", "Welcome Turkey");
		 return "welcome";

	}

}
