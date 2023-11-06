package com.isw.codeexamples;

public class Fire {

    private int temp;

    public void setTemp(int temp){
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Fire{" +
                "temp=" + temp +
                '}';
    }
}