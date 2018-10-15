package com.example.demo.service;

import com.example.demo.entity.Demo;

import java.util.List;

public interface DemoService {
    List<Demo> getDemoList();
    Demo add(Demo demo);
    Demo getDemoById(Integer id);
    void deleteDemo(Integer id);
    List<Demo> getDemoByWeather(String weather);
}
