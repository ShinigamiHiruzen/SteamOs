package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Motores {

    protected DcMotor Fright;
    protected DcMotor Fleft;
    private HardwareMap hwmap;
    protected Telemetry tlmtr;

    public void Sethardware() {

        Fright = hwmap.dcMotor.get("Right motor");
        Fleft = hwmap.dcMotor.get("Left motor");

        tlmtr.addData("Motors", "Loaded!");
        tlmtr.update();
    }
}
