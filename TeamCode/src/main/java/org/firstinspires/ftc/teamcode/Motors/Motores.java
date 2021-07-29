package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Motores {

    protected DcMotor Fright; //this variable is responsible for right motor
    protected DcMotor Fleft; //this variable is responsible for left motor
    private HardwareMap hwmap; //this variable is responsible for hardware map
    protected Telemetry tlmtr; //this variable is responsible for telemetry

    public void Sethardware() {

        Fright = hwmap.dcMotor.get("Right motor"); //this variable is responsible for connect motor to hardware map
        Fleft = hwmap.dcMotor.get("Left motor"); // this variable is responsible for connect motor to hardware map
     }
}
