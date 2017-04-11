package edu.kaist.biosoft.bis332.week7.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Junseok Park on 2017-04-11.
 */

@Controller
public class FirstWebController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "First Web Application in BiS332";

    @RequestMapping("/")
    public String HelloWord(Model model) {
        model.addAttribute("message",this.message);
        return "HelloWorld";
    }

    @RequestMapping("/scriptlet")
    public String Scriptlet(Model model){
        model.addAttribute("message","Scriptlet Practice");
        return "JSP_ex/Scriptlet";
    }

    @RequestMapping("/includeTest")
    public String IncludeTest() {
        return "JSP_ex/IncludeTest";
    }

}
