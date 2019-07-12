package com.designpatterns.ObserverTwo;

import com.designpattern.Observer.Speedometer;
import com.designpatterns.ObserverTwo.SpeedoMeterEvent;
import com.designpatterns.ObserverTwo.SpeedoMeterListener;
import java.util.Observable;

public class BikeGearBox implements SpeedoMeterListener {

    @Override
    public void speedChange(SpeedoMeterEvent event) {
        if(event.getSpeed() <= 5){
            System.out.println("Now in easy gear");
        } else if( event.getSpeed() <= 10) {
            System.out.println("Now in 2nd gear");
        } else if ( event.getSpeed() <= 20) {
            System.out.println("Now in 3rd gear");
        }else if (event.getSpeed() <=25) {
            System.out.println("Now in 4th gear");
        }else if (event.getSpeed() <=30) {
            System.out.println("Now in 5th Gear");
        }
    }
}