package stackjava.com.springmvchello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/test1/{id}")
    public String test1(@PathVariable("id") int id, Model model) {
        model.addAttribute("id", id);
        return "test1";
    }
    @RequestMapping("/test2/{id}/{name}")
    public String test2(@PathVariable("id") int id, @PathVariable("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test2";
    }
    @RequestMapping("/test3")
    public String test3(@RequestParam("name") String name, @RequestParam("id") int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test3";
    }
    @RequestMapping("/test4")
    @ResponseBody
    public String test1() {
        return "test1";
    }
}
