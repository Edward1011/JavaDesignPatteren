package com.DesingPattern.Decorator;

import com.designpattern.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {
   public GoldFrameOption (BikeInterface bike) { super(bike); }

    @Override
    public float getPrice() {
        return decoratedbike.getPrice() + 300.00F ;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + getWheel() + ", GoldPrice = $" + getPrice() + ")";
    }

}
