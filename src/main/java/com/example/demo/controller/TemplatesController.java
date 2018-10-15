package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

    @RequestMapping(value = {"/getTemplates","/hello"},method = RequestMethod.GET)
    public String getTemplates(){
        return "index";
    }
}
