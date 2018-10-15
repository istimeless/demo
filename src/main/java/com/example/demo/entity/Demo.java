package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Demo {
    @Id
    @GeneratedValue
    private Integer id;

    private String weather;

    @Min(value = 18,message = "需要大于18")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", weather='" + weather + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
