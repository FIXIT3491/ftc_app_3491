package com.qualcomm.ftcrobotcontroller.gamecode;

import com.qualcomm.ftcrobotcontroller.opmodesupport.TeleOpMode;
import com.qualcomm.ftcrobotcontroller.robots.Robot;

/**
 * Created by Windows on 2016-07-07.
 */
public class BasicTeleOp extends TeleOpMode {

    Robot robot;

    @Override
    public void initialize() {
        robot = new Robot();
    }

    @Override
    public void loopOpMode() {
        robot.driveL(joy1.y1());
        robot.driveR(joy1.y2());
    }
}
