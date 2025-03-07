package org.firstinspires.ftc.teamcode.theoryrobot;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {
    private HardwareMap hardwareMap;

    public DcMotorEx lF, lR, rF, rR;
    public Servo S1, S2;
    public Limelight3A limeLight;
    public Hardware(HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
        lF = hardwareMap.get(DcMotorEx.class, "cm0");
        lR = hardwareMap.get(DcMotorEx.class, "cm1");
        rF = hardwareMap.get(DcMotorEx.class, "cm2");
        rR = hardwareMap.get(DcMotorEx.class, "cm3");

        lF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rF.setDirection(DcMotorSimple.Direction.REVERSE);

        S1 = hardwareMap.get(Servo.class, "cs0");
        S2 = hardwareMap.get(Servo.class, "cs1");

    }
}
