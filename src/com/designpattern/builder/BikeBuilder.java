package com.designpattern.builder;

import com.designpattern.base.BikeInterface;

public abstract class BikeBuilder {
    public abstract BikeInterface getBike();
    public void buildStreetTires(){ }
    public void buildWideTires() { }
    public void buildHandleBars() { }


    }//End class
