package com.qualcomm.ftcrobotcontroller.newhardware;

/**
 * Created by FIXIT on 16-08-03.
 */
public interface Timeable {

    void setTargetTime(long newTime);

    boolean timeFin();

}
