package com.swati;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by swati on 9/10/16.
 */
public class PersonVoter {


    @NotNull
    @Size(min=2,max=30)
    String name;
    int age;

    @Override
    public String toString() {
        return "PersonVoter{" +
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
