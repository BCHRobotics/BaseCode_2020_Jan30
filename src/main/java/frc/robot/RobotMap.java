/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

    //MOTORS

    //Drive Train
    public static int SPARK_FRONTLEFT = 11;
    public static int SPARK_FRONTRIGHT = 15;
    public static int SPARK_BACKLEFT = 12;
    public static int SPARK_BACKRIGHT = 16;

    /********************************** */

    //CONTROLERS

    public static int OI_DRIVESTICK_USB = 0;
    public static int OI_FUNSTICK_USB = 1;
    public static int OI_PROSTICK_USB = 2;
    public static int OI_TESTSTICK_USB = 3;

    //DriveStick Axis
    public static int OI_DRIVESTICK_MOVEY = 1;
    public static int OI_DRIVESTICK_TURN = 0;

    //DriveStick Buttons
    public static int BTN_DRIVESTICK_TURBO = 6;
    public static int BTN_DRIVESTICK_SNAIL = 5;

    /********************************** */

    //PID
    public static double P_DRIVETRAIN = 1;
    public static double I_DRIVETRAIN = 0;
    public static double D_DRIVETRAIN = 0;

    public static double P_NAVX= 1;
    public static double I_NAVX = 0;
    public static double D_NAVX = 0;

    public static double P_DRIVETRAIN_OLD = 2.25;
    public static double I_DRIVETRAIN_OLD = 0.0001;
    public static double D_DRIVETRAIN_OLD = 0;

    public static double P_NAVX_OLD = 1.75;
    public static double I_NAVX_OLD = 0.0001;
    public static double D_NAVX_OLD = 0;





}
 