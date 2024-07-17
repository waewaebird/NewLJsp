package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "HHEELLLO INDEX";
        //return "root.index";
    }

    /*@Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView("root.index");
        mv.addObject("data", "Hello Spring MVC!!!");
        //mv.setViewName("/WEB-INF/view/index.jsp");

        return mv;
    }*/
}
