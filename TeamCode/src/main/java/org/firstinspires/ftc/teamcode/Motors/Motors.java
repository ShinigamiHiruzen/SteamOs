package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Motors extends Motores implements InterfaceMotors {

    private Telemetry telemetry = super.tlmtr;
    private DcMotor fright = super.Fright;
    private DcMotor fleft = super.Fleft;
    private ElapsedTime lp;

    public void fright(){
        fright.setDirection(DcMotor.Direction.FORWARD);

        fright.setPower(1);
        try {
            lp.wait();
        } catch (InterruptedException e) {
            telemetry.addData("error: ", fright.getConnectionInfo());
        }
        fright.setPower(0);
    }
    public void fleft(){
        fleft.setDirection(DcMotor.Direction.REVERSE);
        fleft.setPower(1);
        try {
            lp.wait();
        } catch (InterruptedException e) {
            telemetry.addData("Error: ", fleft.getConnectionInfo());
        }
        fleft.setPower(0);

    }
    public void activated(){
        if(fleft.getPower() > 1){
            telemetry.addData("MotorL", "Loaded!");
            telemetry.update();
             if(fright.getPower() > 1){
              telemetry.addData("MotorR", "Loaded!");
              telemetry.update();
            }
        }
    }

}


