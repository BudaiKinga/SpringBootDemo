package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/index")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(1,"Kinga");
        Student s2 = new Student(2, "Kinga2");
        students.add(s1);
        students.add(s2);
        model.addAttribute("students", students);
        return "myPage";
    }

}
