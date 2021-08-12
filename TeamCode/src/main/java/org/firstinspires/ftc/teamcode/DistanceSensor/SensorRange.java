package org.firstinspires.ftc.teamcode.DistanceSensor;

import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class SensorRange extends SensorCm implements SensorInterface {

    private DistanceSensor ds = super.ds;
    private Telemetry tlmtr = super.telemetry;

    public void range(){

        if(ds.getDistance(DistanceUnit.CM) >= 0);
        tlmtr.addData("Distance: ", ds.getDistance(DistanceUnit.CM));
        tlmtr.update();

        tlmtr.addData("Error: ", ds.getConnectionInfo());
        tlmtr.update();
    }


    public String Sensorname(){
        return ds.getDeviceName();  }
}
