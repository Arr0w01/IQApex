package com.codewitharrow.iqapex.models;

public class BCModel {
    String name,lastPrice, gain;

    public BCModel(String name,String lastPrice, String gain){
        this.name = name;
        this.lastPrice = lastPrice;
        this.gain = gain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getGain() {
        return gain;
    }

    public void setGain(String gain) {
        this.gain = gain;
    }

    public  BCModel(){}
}
