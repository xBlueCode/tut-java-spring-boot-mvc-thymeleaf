package xbc.tut.springbootmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController1 {

  @GetMapping("/example-1")
  public String processExample(Model model){

    // Add current date object as an attribute for the model
    model.addAttribute("currentDate", LocalDate.now());

    // Add a collection of objects as an attribute for the model
    Collection<String> subjects = new ArrayList<>();
    subjects.add("Mathematics");
    subjects.add("Physics");
    subjects.add("History");
    subjects.add("English Grammar");

    model.addAttribute("subjects", subjects);

    return "example1";
  }
}
