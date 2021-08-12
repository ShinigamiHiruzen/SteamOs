package org.firstinspires.ftc.teamcode.ColorSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class SensorC {

    protected ColorSensor crs;
    protected HardwareMap hwmap;
    protected Telemetry telemetry;

    public void hardwaremap(){

        crs = (ColorSensor)hwmap.get("Color");

        telemetry.addData("Color", "Loaded!");
        telemetry.update();

    }
}
