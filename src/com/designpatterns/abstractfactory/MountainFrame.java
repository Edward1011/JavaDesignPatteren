package com.designpatterns.abstractfactory;

public class MountainFrame implements BikeFrameInterface {
    @Override
    public String getFrameParts(){
        return "Frame parst for the Mountain Bike.";
    }
}
