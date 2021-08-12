package org.firstinspires.ftc.teamcode.Motors.Joystick;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Motors.Motors;

public class Joystick extends LinearOpMode {

    private DcMotor fright;
    private DcMotor fleft;
    private HardwareMap hwmap;
    private Telemetry tlmtr;
    private Motors m = new Motors();

    public void Hwmap(){

        fright = hwmap.dcMotor.get("fright");
        fleft = hwmap.dcMotor.get("fleft");
        tlmtr.addData("Loaded: ", hardwareMap.getNamesOf(fleft) + " + " + hardwareMap.getNamesOf(fright));
        tlmtr.update();
    }

    @Override
    public void runOpMode() throws InterruptedException {

        fright.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();

        while(opModeIsActive()){
            tlmtr.addData("Status", "Run time");
            tlmtr.update();

            fleft.setPower(-gamepad1.left_stick_y);
            fright.setPower(-gamepad1.right_stick_y);
        }

        if(gamepad1.a){
            fright.setPower(0.5);
            fleft.setPower(0.5);
            tlmtr.addData("Walking: ", fleft.getPower() + " and " + fright.getPower());
        }
        else{
            fright.setPower(0);
            fleft.setPower(0);
            tlmtr.addData("Rest", "Robot stopped");
        }
        tlmtr.update();

        if(gamepad1.y){
            fright.setPower(-0.5);
            fleft.setPower(-0.5);
            tlmtr.addData("Walking Backward: ", fleft.getPower() + " and " + fright.getPower());
        }
        else{
            fright.setPower(0);
            fleft.setPower(0);
            tlmtr.addData("Rest", "Robot stopped");
        }
        tlmtr.update();
    }
}
