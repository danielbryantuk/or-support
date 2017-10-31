package uk.co.bigpicturetech.conferences.conferencemono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uk.co.bigpicturetech.conferences.conferencemono.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("add")
    public String addUser() {
        return "user/add-user";
    }

    @RequestMapping("update")
    public String updateUser(Model model) {
        return "user/view-user";
    }

    @RequestMapping("view")
    public String viewUser(Model model) {
        User user = new User();
        user.setFirstName("Daniel");
        user.setSurname("Bryant");

        model.addAttribute(user);
        return "user/view-user";
    }

    @RequestMapping("list")
    public String listUsers(Model model) {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setFirstName("Daniel");
        user.setSurname("Bryant");
        users.add(user);

        model.addAttribute("users", users);
        return "user/list-users";
    }
}
