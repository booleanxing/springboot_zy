package com.dx.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    //    @Value("${person.last-name}")
//    @Email
    private String lastName;
    //    @Value("${person.age}")
//    @Min(20)
    @Value("#{25*2}")
    private Integer age;
    private boolean VIP;
    private Date birh;

    private Map<String, String> maps;
    private List<String> lists;
    private Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", VIP=" + VIP +
                ", birh=" + birh +
                ", maps=" + maps +
                ", lists=" + lists +
                ", pet=" + pet +
                '}';
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public Date getBirh() {
        return birh;
    }

    public void setBirh(Date birh) {
        this.birh = birh;
    }
}
//@Validated
