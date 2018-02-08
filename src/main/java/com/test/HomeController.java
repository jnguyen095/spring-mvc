package com.test;

import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 07/02/2018
 * Time: 4:16 PM
 */
@Controller
public class HomeController extends ApplicationObjectSupport{

    @RequestMapping("/home.html")
    public String home(ModelMap model){
         model.addAttribute("message", "Spring is running...");
        return "index";
    }
}
