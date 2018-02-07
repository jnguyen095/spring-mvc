package com.test;

import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 07/02/2018
 * Time: 4:16 PM
 */
@Controller
public class HomeController extends ApplicationObjectSupport{

    @RequestMapping("/home.html")
    public String home(){
        return "index";
    }
}
