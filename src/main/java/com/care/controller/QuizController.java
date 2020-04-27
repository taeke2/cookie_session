package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
	@RequestMapping("quiz")
	public String quiz(@CookieValue(value = "myCookie", required = false) Cookie cook, Model model) {
		if(cook != null)
			model.addAttribute("cook",cook.getName());
		return "quiz/login";
	}
	
	@RequestMapping("quiz_popup")
	public String quiz_popup() {
		return "quiz/popup";
	}
	
	@RequestMapping("quiz_cookieChk")
	public void quiz_cookieChk(HttpServletResponse response) {
		Cookie cook = new Cookie("myCookie", "나의쿠키");
		cook.setMaxAge(10);
		cook.setPath("/");
		response.addCookie(cook);
	}
	
	@PostMapping("quiz_chkUser")
	public String quiz_chkUser(HttpServletRequest request) {
		String id = "1", pwd = "1", nickName="홍길동";
		String reqId = request.getParameter("id");
		String reqPwd = request.getParameter("pwd");
		HttpSession session = null;
		if(id.equals(reqId) && pwd.equals(reqPwd)) {
			session = request.getSession();
			session.setAttribute("loginUser", nickName);
			return "quiz/main";
		}else {
			return "redirect:quiz";
		}
	}
	
	@RequestMapping("quiz_logout")
	public String quiz_logout(HttpSession session) {
		session.invalidate();
		return "redirect:quiz";
	}
	
	@RequestMapping("quiz_main")
	public String quiz_main() {
		return "quiz/main";
	}
}
