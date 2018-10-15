package com.example.demo.controller;

import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Demo> get(){
        return demoService.getDemoList();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Demo add(@Valid Demo demo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        return demoService.add(demo);
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Demo getDemoById(@PathVariable("id") Integer id){
        return demoService.getDemoById(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Demo update(Demo demo){
        return demoService.add(demo);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public void delete(@PathVariable("id")Integer id){
        demoService.deleteDemo(id);
    }

    @RequestMapping(value = "/getWeather/{weather}",method = RequestMethod.GET)
    public List<Demo> getDemoByWeather(@PathVariable("weather")String weather){
        return demoService.getDemoByWeather(weather);
    }
}
