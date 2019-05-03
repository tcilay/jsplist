package com.tcilay.jsplist.bean;

import java.io.Serializable;

/**
 * @author tcilay
 * @create 2019-05-01 18:21
 */
public class Car implements Serializable {
    private String name;
    private String desc;

    public Car(){}

    public Car(String name,String desc){
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
