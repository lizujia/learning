package com.lizj.controller_05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hac")
// 别猜了, hac是HeaderAndCookie的首字母 - -|
public class HeaderAndCookieController {

    @RequestMapping("/show")
    public String show() {
        return "hac/page";
    }
    
    @RequestMapping("/testRequestHeader")
    public void testRequestHeader(@RequestHeader("User-Agent") String userAgent,
                                  @RequestHeader("Accept") String[] accepts,
                                  @RequestHeader("Accept-Encoding") String acceptEncoding) {
        System.out.println("@RequestHeader获取的数据为: " );
        System.out.println("User-Agent: " + userAgent);
        System.out.println("Accept: ");
        for(String accept : accepts) {
            System.out.println(accept);
        }
        System.out.println("Accept-Encoding: " + acceptEncoding);
    }
    
    @RequestMapping("/testCookieValue")
    public void testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("@CookieValue获取的数据为: " );
        System.out.println("JSESSIONID: " + sessionId);
    }
    
}
