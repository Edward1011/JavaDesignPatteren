package com.DesingPattern.Decorator;

import com.designpattern.base.BikeInterface;

public class WhiteTireOption extends AbstractBikeOption {

    public WhiteTireOption(BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedbike.getPrice() + 80.00F;
    }
}
