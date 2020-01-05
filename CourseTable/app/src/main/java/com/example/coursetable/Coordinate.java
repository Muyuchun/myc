package com.example.coursetable;

import java.io.Serializable;

public class Coordinate implements Serializable {
    private int position;
    private int classNum;
    private String className;

    public Coordinate(int position, int classNum, String className) {
        this.position = position;
        this.classNum = classNum;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassNum() {
        return classNum;
    }

    public int getPosition() {
        return position;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
