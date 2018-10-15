package com.example.demo.dao;

import com.example.demo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemoRepository extends JpaRepository<Demo,Integer> {
    List<Demo> findDemoByWeather(String weather);
}
