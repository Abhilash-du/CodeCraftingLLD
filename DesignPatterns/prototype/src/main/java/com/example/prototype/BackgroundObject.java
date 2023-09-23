package com.example.prototype;

import lombok.AccessLevel;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class BackgroundObject implements GraphicalObject{


    private Double x;
    private Double y;
    private Double height;
    private Double width;
    private BackgroundType type;

    @Setter(AccessLevel.NONE)
    private List<Double> pixels=new ArrayList<>();

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundType type, List<Double> pixels) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = pixels;
    }

    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, width, height, type, pixels);
    }
    @Override
    public BackgroundObject cloneObject() {
        return new BackgroundObject(this.);
    }
}
