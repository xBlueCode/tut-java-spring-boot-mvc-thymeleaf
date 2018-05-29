package xbc.tut.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController2 {

  @GetMapping("/example-2")
  public String processExample(Model model) {

    // Create an array of signed integers
    int[] numArray = new int[] {1,3,5,-3,2,0,9,-7,25,4,-19,3,21,89,43,7};

    model.addAttribute("numbers", numArray);

    return "example2";
  }
}
