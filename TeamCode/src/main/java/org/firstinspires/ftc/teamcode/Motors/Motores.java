package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Motores {

    protected DcMotor Fright; //this variable is responsible for right engine
    protected DcMotor Fleft; //this variable is responsible for left engine
    private HardwareMap hwmap; //this variable is responsible for hardware map
    protected Telemetry tlmtr; //this variable is responsible for telemetry

    public void Sethardware() {

        // this variables is responsible for connect engines to hardware map
        Fright = hwmap.dcMotor.get("Right motor"); 
        Fleft = hwmap.dcMotor.get("Left motor"); 
       
     }
}
