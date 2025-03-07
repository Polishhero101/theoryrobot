package org.firstinspires.ftc.teamcode.theoryrobot;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Config
@TeleOp(name = "Small Tele")
public class telop extends OpMode {
    private Hardware robot;
    public void init(){
        robot = new Hardware(hardwareMap);
    }
    public void loop(){
        robot.lF.setPower(gamepad1.left_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x);
        robot.rF.setPower(gamepad1.left_stick_y-gamepad1.left_stick_x-gamepad1.right_stick_x);
        robot.lR.setPower(gamepad1.left_stick_y+gamepad1.left_stick_x-gamepad1.right_stick_x);
        robot.rR.setPower(gamepad1.left_stick_y-gamepad1.left_stick_x+gamepad1.right_stick_x);


    }
}
