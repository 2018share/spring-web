package com.dianping.cip;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaoleizhou@gmail.com
 *         Created At 2018/1/14.
 *         Desc:
 */
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        //return "WEB-INF/views/home.jsp";
        return "home";
    }

}
