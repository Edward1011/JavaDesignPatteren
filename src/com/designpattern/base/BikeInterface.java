package com.designpattern.base;

import com.designpattern.java.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();

    void paint(BikeColor color);


}

