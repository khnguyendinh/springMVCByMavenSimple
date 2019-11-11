package stackjava.com.springmvchello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import stackjava.com.springmvchello.entities.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }
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

    @RequestMapping(value = { "/SpringFormAdd"}, method = RequestMethod.GET)
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String doAddEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        employee.setName(employee.getName().toUpperCase());
        modelMap.addAttribute("employee", employee);
        return "view-employee";
    }
    @RequestMapping(value = "/SpringForm")
    public String springForm() {
        return "add-employee";
    }
    @RequestMapping(value={"addEmployee2"}, method = RequestMethod.GET)
    public String addEmployee2(Model model) {
        model.addAttribute("employee", new Employee());
        List<String> listFavorite = new ArrayList<String>();
        listFavorite.add("Swimming");
        listFavorite.add("Listening music");
        listFavorite.add("Walking");
        listFavorite.add("Watching movie");
        listFavorite.add("Reading comic");
        model.addAttribute("listFavorite", listFavorite);
        List<String> listPosition = new ArrayList<String>();
        listPosition.add("Developer");
        listPosition.add("Designer");
        listPosition.add("Tester");
        listPosition.add("QA");
        model.addAttribute("listFavorite", listFavorite);
        model.addAttribute("listPosition", listPosition);
        return "add-employee2";
    }
    @RequestMapping(value = "/addEmployee2", method = RequestMethod.POST)
    public String doAddEmployee2(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        modelMap.addAttribute("employee", employee);
        return "view-employee2";
    }
    @RequestMapping("/")
    public String page1() {
        return "page1";
    }
    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:page2";
    }
    @RequestMapping("/page2")
    public String page2() {
        return "page2";
    }

    @RequestMapping("/redirect2")
    public RedirectView redirect2(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        System.out.println(name);
        redirectAttributes.addAttribute("name", name);
        return new RedirectView("page22");
    }
    @RequestMapping("/page22")
    public String page22(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "page2";
    }

}
