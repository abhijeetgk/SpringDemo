/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abhijeet.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author PHP
 */
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public ModelAndView HelloWorld() {
        String message="Welcome in Spring 3.0 with dinesh";
        return new ModelAndView("hello","message",message);
    }

}
