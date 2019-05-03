package com.tcilay.jsplist.bean;

import javax.xml.soap.Detail;
import java.io.Serializable;
import java.util.List;

/**
 * @author tcilay
 * @create 2019-05-01 18:20
 */
public class User implements Serializable {

    private List<Car> names;

    public List<Car> getNames() {
        return names;
    }

    public void setNames(List<Car> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "User{" +
                "names=" + names +
                '}';
    }
}
