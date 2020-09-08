package com.example.feature.level1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ErrorControllerインタフェースの実装
 *
 * @see <a href="https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/servlet/error/ErrorController.html">
 */

@Controller
@RequestMapping("/error")
public class Level2ErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping
    public ModelAndView error(ModelAndView mav) {
        mav.setStatus(HttpStatus.NOT_FOUND);
        mav.setViewName("error404");
        mav.addObject("errorDescription", "404 Not Found");
        return mav;
    }
}
