package com.dependencyinversion.DependencyInversion.lowlevel;

import com.dependencyinversion.DependencyInversion.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
