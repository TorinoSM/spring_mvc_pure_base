package spring_mvc_pure_base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class BaseController {

    @RequestMapping("/nexturl")
    public ModelAndView procceedRequest() {

        String modelMessage = "Current time is: " + new Date().toString() + "<br>(русский язык)";
        return new ModelAndView("pages/nextpage", "message", modelMessage);
    }
}
