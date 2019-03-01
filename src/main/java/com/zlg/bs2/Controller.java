package com.zlg.bs2;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/index")
    public String test(HttpSession session) {
        session.setAttribute("user","zlg");
        return "index";
    }
}
