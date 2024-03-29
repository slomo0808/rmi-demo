package com.lagou.pojo;

import java.io.Serializable;

/**
 * 引用对象应该去实现序列化接口，这样才能在实现时去实现序列化和反序列化
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1414893486849866382L;

    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
