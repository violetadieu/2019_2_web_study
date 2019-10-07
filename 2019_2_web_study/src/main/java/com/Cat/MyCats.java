package com.Cat;

import java.util.ArrayList;

public class MyCats {
    //내 고양이에 대한 정보
    private String name;//이름
    private int age;
    private ArrayList<String> hobbys;
    private double weight;
    private String color;

    public MyCats(String name, int age, ArrayList<String> hobbys) {
        this.name = name;
        this.age = age;
        this.hobbys = hobbys;
    }

    /**
     * 고양이 무게 가져오기
     * @return 이 고양이의 몸무게
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

}
