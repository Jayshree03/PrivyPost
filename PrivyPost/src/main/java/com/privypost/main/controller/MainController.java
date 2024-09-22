package com.privypost.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("main")
	public String MainPage() {
		return "Main";
	}
	@RequestMapping("signup")
	public String signUp() {
		return "UserSignUp";
	}
	@RequestMapping("login")
	public String Login() {
		return "UserLogin";
	}
}
