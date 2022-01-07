package com.dependencyinversion.DependencyInversion;

import com.dependencyinversion.DependencyInversion.highlevel.ElectricPowerSwitch;
import com.dependencyinversion.DependencyInversion.highlevel.Switch;
import com.dependencyinversion.DependencyInversion.highlevel.Switchable;
import com.dependencyinversion.DependencyInversion.lowlevel.Fan;
import com.dependencyinversion.DependencyInversion.lowlevel.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}