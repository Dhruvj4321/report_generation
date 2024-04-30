package com.report.generation.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@CrossOrigin
public class IndexController {
	
	
	

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/report")
    public String redirectToReport(@RequestParam(required = false) String nutrition,
                                    @RequestParam(required = false) String emotion,
                                    @RequestParam(required = false) String time,
                                    @RequestParam(required = false) String newsletter,
                                    Model model) {
        // Add logic to pass these parameters to the report.html template
        model.addAttribute("nutrition", nutrition);
        model.addAttribute("emotion", emotion);
        model.addAttribute("time", time);
        model.addAttribute("newsletter", newsletter);
        return "report"; 
    }
    
    
    @GetMapping("/ques")
    public String redirectToQues() {
        return "ques"; // Return the name of the Thymeleaf template
    }

//    @GetMapping(value = "/exportReport", produces = MediaType.APPLICATION_XML_VALUE)
//    @ResponseBody
//    public byte[] exportReport() throws IOException {
//        Resource resource = new ClassPathResource("resources/Report_essas.prpt");
//        return Files.readAllBytes(resource.getFile().toPath());
//    }
}