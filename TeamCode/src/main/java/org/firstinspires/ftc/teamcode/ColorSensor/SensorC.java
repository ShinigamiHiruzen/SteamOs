package org.firstinspires.ftc.teamcode.ColorSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

public class SensorC {

    protected ColorRangeSensor crs;
    protected HardwareMap hwmap;
    protected Telemetry telemetry;

    public void harwaremap(){

        crs = (ColorRangeSensor)hwmap.get("Color");

        telemetry.addData("Color", "Loaded!");
        telemetry.update();

    }
}
