package com.wildschool.myDoctoredApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyDoctoredAppApplication {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<li><a href=\"/doctor/10\">10</a></li>" + 
				"<li><a href=\"/doctor/11\">11</a></li>" + 
				"<li><a href=\"/doctor/12\">12</a></li>" +
				"<li><a href=\"/doctor/13\">13</a></li>";
	}


	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10() {
		return "David Tennant";
	}

	@RequestMapping("/doctor/11")
	@ResponseBody
	public String doctor11() {
		return "Matt Smith";
	}

	@RequestMapping("/doctor/12")
	@ResponseBody
	public String doctor12() {
		return "Peter Capaldi";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {
		return "Jodie Whittaker";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyDoctoredAppApplication.class, args);
	}

}
