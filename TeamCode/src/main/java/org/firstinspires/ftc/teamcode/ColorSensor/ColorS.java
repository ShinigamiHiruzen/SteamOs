package org.firstinspires.ftc.teamcode.ColorSensor;

import com.qualcomm.robotcore.hardware.ColorSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class ColorS extends SensorC implements ColorInterface {

    ColorSensor crs = super.crs;
    Telemetry tlmtr = super.telemetry;

    public void colors() {

        for(;;){

            tlmtr.addData("red: ", crs.red());
            tlmtr.addData("green: ", crs.green());
            tlmtr.addData("blue: ", crs.blue());
            tlmtr.addData("alpha: ", crs.alpha());
            tlmtr.update();
        }
    }

    public String colorSensorname() {
        return crs.getDeviceName();
    }
}
