package dev.kerimfettahoglu.redisspringsessionintegration.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }

    private final String attributeName = "projectCounter";

    @GetMapping("/counter")
    public String incrementCounter(HttpSession session) {
        Integer tmpCounter = session.getAttribute(attributeName) == null ? 0 : (Integer) session.getAttribute(attributeName);
        session.setAttribute(attributeName, ++tmpCounter);
        return "count :" + session.getAttribute(attributeName);
    }
}
