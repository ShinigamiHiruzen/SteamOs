package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import com.qualcomm.robotcore.util.ElapsedTime;

public class Motors extends Motores implements InterfaceMotors {

    // this variable is responsible of connect the variables for class "MotorsHwmap" for class "Motors"
    private Telemetry telemetry = super.tlmtr; 
    private DcMotor fright = super.Fright; 
    private DcMotor fleft = super.Fleft; 
    
    // this variable is responsible for Elapsed time
    private ElapsedTime lp; 

    public void fright(){
        // this variable is responsible for the direction of motor
        fright.setDirection(DcMotor.Direction.FORWARD);  
        
        // this variable is responsible for power of motor
        fright.setPower(1);  
        
        // this variable is responsible for detect error and to send for console
        try {
            // this variable is responsible for the time the engine will stay on
            lp.wait(10);
        } catch (InterruptedException e) {
            telemetry.addData("error: ", fright.getConnectionInfo());
        }
                         
        // this variable is responsible for power of motor
        fright.setPower(0);
    }
    public void fleft(){
        // this variable is responsible for the direction of motor
        fleft.setDirection(DcMotor.Direction.REVERSE);
        
        // this variable is responsible for power of motor
        fleft.setPower(1);
        
        // this variable is responsible for detect error and to send for console
        try {
            // this variable is responsible for the time the engine will stay on
            lp.wait(10); 
        } catch (InterruptedException e) {
            telemetry.addData("Error: ", fleft.getConnectionInfo());
        }
        
        // this variable is responsible for power of motor
        fleft.setPower(0);

    }
    public void activated(){
        // this variable is responsible for checking if the motor is activated. If the engine power is greater than 1, the engine is activated
        if(fleft.getPower() > 1){
            telemetry.addData("MotorL", "Activated!");
            telemetry.update();
            
             if(fright.getPower() > 1){
              telemetry.addData("MotorR", "Activated!");
              telemetry.update();
            }
        }
    }
    public void off(){
        // this variable is responsible for checking if it is disabled. If the engine power is less than 1, the engine is disabled
        if(fleft.getPower() == 0){
            telemetry.addData("MotorL", "Disabled!");
            telemetry.update();
            
            if(fright.getPower() == 0){
                telemetry.addData("MotorR", "Disabled!");
                telemetry.update();
            }
        }
    }
}
