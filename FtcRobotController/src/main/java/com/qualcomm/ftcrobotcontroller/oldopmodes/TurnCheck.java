package com.qualcomm.ftcrobotcontroller.oldopmodes;

import com.qualcomm.ftcrobotcontroller.opmodesupport.TeleOpMode;
import com.qualcomm.ftcrobotcontroller.robots.Lily;

/**
 * Created by Windows on 2016-04-23.
 */
public class TurnCheck extends TeleOpMode {

    Lily lily;
    int stage = 0;

    @Override
    public void initialize() {
        lily = new Lily();
    }

    @Override
    public void loopOpMode() {
        lily.forward(0.15);
    }
}
