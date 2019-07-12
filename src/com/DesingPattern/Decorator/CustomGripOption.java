package com.DesingPattern.Decorator;

import com.designpattern.base.BikeInterface;

public class CustomGripOption extends AbstractBikeOption {

    public CustomGripOption(BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedbike.getPrice() + 20.00F;
    }
}

