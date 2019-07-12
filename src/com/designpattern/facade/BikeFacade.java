package com.designpattern.facade;

import com.designpattern.base.BikeInterface;

public class BikeFacade {
    public void prepareForSale(BikeInterface bike) {
        Registration reg = new Registration(bike);
        reg.allocatingBikeNumber();
        Documentation.PrintBrochure();
        bike.airTire();
        bike.cleanFrame();
        bike.testRide();
    }
}