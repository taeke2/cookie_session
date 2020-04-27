package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request, HttpSession session) {
		//매개변수로 받아서 사용해도되고 아래처럼 request로 받아서 사용해도된다.
		//HttpSession session = request.getSession();
		session.setAttribute("id", "홍길동");
		session.setAttribute("age", "20");
		session.setAttribute("addr", "산골짜기");
		return "session/makeSession";
	}

	@RequestMapping("resultSession")
	public String resultSession() {
		return "session/resultSession";
	}

	@RequestMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		//session.invalidate();
		return "session/delSession";
	}
}
