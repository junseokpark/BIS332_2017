package edu.kaist.biosoft.bis332.week7.web.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Junseok Park on 2017-04-11.
 */

@Controller
public class ExerciseController {
    @GetMapping("/exercise")
    public String exerciseForm(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "JSP_ex/Exercise";
    }

    @PostMapping("/exercise")
    public String exerciseSubmit(@ModelAttribute Exercise exercise) {
        return "JSP_ex/Exercise_result";
    }
}
