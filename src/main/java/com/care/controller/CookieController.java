package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response, @CookieValue(value = "myCookie", required = false) Cookie cook,
			HttpServletRequest request) {
		// required = false 는 해당하는 값이 있으면 넣고 없으면 지나쳐라 라는 뜻
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies)
				System.out.println(c.getName() + " : " + c.getValue());
		}
		System.out.println("cook : " + cook);
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		return "cookie";
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("cookie02")
	public String myCookie02(HttpServletResponse response,
			@CookieValue(value = "myCookie", required = false) Cookie cook, Model model) {
		/*
		if (cook == null) {
			Cookie cookie = new Cookie("myCookie", "퀴즈쿠키생성");
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		} else {
			model.addAttribute("cook", cook.getName());
		}
		*/
		if(cook != null )
			model.addAttribute("cook",cook.getName());
		System.out.println(cook);
		return "cookie02";
	}

	@RequestMapping("popup")
	public String popup() {
		return "popup";
	}
	
	@RequestMapping("cookieChk")
	public void cookieChk(HttpServletResponse response) {
		Cookie cook = new Cookie("myCookie", "나의쿠키");
		cook.setMaxAge(10);
		cook.setPath("/");
		response.addCookie(cook);
		//return "popup";
	}
}
