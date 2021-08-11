package org.firstinspires.ftc.teamcode.DistanceSensor;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SensorCm {

    protected DistanceSensor ds;
    protected Telemetry telemetry;
    protected HardwareMap hwmap;

    public void hardwaremap(){

        ds = (DistanceSensor) hwmap.get("Range");

        telemetry.addData("Sensor", "Loaded!");
        telemetry.update();
    }
}
