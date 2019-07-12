package com.designpattern.builder;

import com.designpattern.base.BikeInterface;
import com.designpattern.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {

    private MountainBike bikeInProgress;

    public MountainBikeBuilder(MountainBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");
    }
    @Override
    public void buildWideTires() {
        System.out.println("Build Wide Tires");
    }
}
