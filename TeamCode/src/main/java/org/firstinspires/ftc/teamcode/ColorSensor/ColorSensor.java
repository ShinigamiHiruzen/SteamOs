package org.firstinspires.ftc.teamcode.ColorSensor;

import com.qualcomm.robotcore.hardware.ColorRangeSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class ColorSensor extends SensorC implements ColorInterface {

    ColorRangeSensor crs = super.crs;
    Telemetry tlmtr = super.telemetry;

    public void colors(){

    }

    public String colorSensorname(){
        return crs.getDeviceName();
    }
}
