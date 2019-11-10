package stackjava.com.springmvchello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2() {
        return "hello2";
    }
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String doPost() {
        return "test2";
    }
}
