/**
 * 
 */
package com.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Anudeep Kumar
 *
 */

@Controller
public class myController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello Spring");
		return "hello";
	}
}
