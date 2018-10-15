package com.example.demo.service;

import com.example.demo.entity.Demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void getDemoList() {
        List<Demo> list = demoService.getDemoList();
        Assert.assertEquals(list.size(),5);
    }

    @Test
    public void add() {
    }

    @Test
    public void getDemoById() {
    }

    @Test
    public void deleteDemo() {
    }

    @Test
    public void getDemoByWeather() {
    }
}