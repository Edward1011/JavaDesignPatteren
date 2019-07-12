package com.DesingPattern.Decorator;

import com.designpattern.base.AbstractBike;
import com.designpattern.base.BikeInterface;

public class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedbike;

    public AbstractBikeOption (BikeInterface bike) {
        super(bike.getWheel());
        this.decoratedbike = bike;
    }
}
