package com.privypost.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("privypost")
	public String MainPage() {
		return "privypostmain";
	}
	@RequestMapping("signup")
	public String signUp() {
		return "UserSignUp";
	}
	@RequestMapping("login")
	public String Login() {
		return "UserLogin";
	}
	@RequestMapping("sent")
	public String SentEmail() {
		return "sentEmail";
	}
	@RequestMapping("compose")
	public String ComposeEmail() {
		return "composeEmail";
	}
	@RequestMapping("inbox")
	public String Inbox() {
		return "inboxEmail";
	}
}
