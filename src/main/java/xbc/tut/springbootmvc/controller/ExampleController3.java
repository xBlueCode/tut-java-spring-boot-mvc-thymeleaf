package xbc.tut.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xbc.tut.springbootmvc.model.User;

@Controller
public class ExampleController3 {

  @GetMapping("/example-3")
  public String processExample(Model model) {
    model.addAttribute("user", new User());
    return "example3";
  }

  @RequestMapping(value = "/example-3/add-user", method = RequestMethod.POST)
  public String addUser(Model model, @ModelAttribute User user, BindingResult result) {
    if (!result.hasErrors()) {
      model.addAttribute("addedUser", user);
      return "example3-user";
    } else {
      model.addAttribute("errors", result.getFieldErrors());
      return "example3-user-failed";
    }
  }
}
