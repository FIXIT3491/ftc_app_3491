package org.firstinspires.ftc.teamcode.gamecode;

import android.util.Log;

import com.qualcomm.hardware.adafruit.AdafruitBNO055IMU;
import com.qualcomm.hardware.adafruit.BNO055IMU;
import com.qualcomm.hardware.adafruit.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.AngularVelocity;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.teamcode.RC;
import org.firstinspires.ftc.teamcode.newhardware.FXTSensors.AdafruitIMU;
import org.firstinspires.ftc.teamcode.opmodesupport.AutoOpMode;
import org.firstinspires.ftc.teamcode.opmodesupport.LinearTeleOpMode;
import org.firstinspires.ftc.teamcode.opmodesupport.TeleOpMode;
import org.firstinspires.ftc.teamcode.robots.Fermion;

/**
 * Created by Owner on 8/31/2015.
 */
@Autonomous
public class AdafruitCheck extends AutoOpMode{


    @Override
    public void runOp() throws InterruptedException {
        Fermion f = new Fermion(true);
        Log.i("VeerProportional", RC.globalDouble("VeerProportional") + "");
        Log.i("VeerIntegral", RC.globalDouble("VeerIntegral") + "");
        Log.i("VeerDerivative", RC.globalDouble("VeerDerivative") + "");

        f.resetTargetAngle();
        f.addVeerCheckRunnable();
        f.strafe(90, 1, true);
        sleep((long)RC.globalDouble("WaitTime"));
        f.stop();

        Log.i("FINAL ANGLE", f.getIMUAngle()[0] + "");

        sleep(500);
    }
}