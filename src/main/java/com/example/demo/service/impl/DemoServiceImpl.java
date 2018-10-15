package com.example.demo.service.impl;

import com.example.demo.dao.DemoRepository;
import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public List<Demo> getDemoList() {
        return demoRepository.findAll();
    }

    @Override
    @Transactional
    public Demo add(Demo demo) {
        return demoRepository.save(demo);
    }

    @Override
    public Demo getDemoById(Integer id) {
        return demoRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteDemo(Integer id) {
        demoRepository.deleteById(id);
    }

    @Override
    public List<Demo> getDemoByWeather(String weather) {
        return demoRepository.findDemoByWeather(weather);
    }
}
