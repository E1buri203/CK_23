/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.ColorSensorV3.RawColor;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class WOFConstants {

    public static final int WOFMOTOR = 16; // WOF motor (victor)
    
		public static final int PISTONIN = 0; // piston for wof deployment 
    public static final int PISTONOUT = 1;

    public static final RawColor RED = new RawColor(255, 0, 0, 0);
    public static final RawColor GREEN = new RawColor(0, 255, 0, 0);
    public static final RawColor BLUE = new RawColor(0, 255, 255, 0);
    public static final RawColor YELLOW = new RawColor(255, 255, 0, 0);

    public static final RawColor[] wheelColors ={ // the colors on the WOF in order 
      RED, // red
      GREEN, // green
      BLUE, // blue
      YELLOW // Yellow
    };

	public static final double COLOR_THRESHOLD = 50; // how close the color sensor must be to a target color (TBD)

    }

    public static final class DriveConstants {

    // motors
		public static final int LEFT_MOTOR1_PORT = 1; // currently set up for protobot ports 
    public static final int LEFT_MOTOR2_PORT = 3;
    
		public static final int RIGHT_MOTOR1_PORT = 2;
    public static final int RIGHT_MOTOR2_PORT = 4;

    // encoders
    public static final int[] LEFT_ENCODERS = new int[]{0, 1};
    public static final int[] RIGHT_ENCODERS = new int[]{2, 3};

    public static final boolean LEFT_ENCODERS_REVERSE = false;
    public static final boolean RIGHT_ENCODERS_REVERSE = true;
    
    // math garbage
    public static final double ENCODER_COUNT_PER_ROTATION = 360; // number of pulses per full rotation 
    public static final int WHEEL_DIAMETER = 6; // size of the wheels 
    public static final double kEncoderDistancePerPulse =
    // Assumes the encoders are directly mounted on the wheel shafts
    (WHEEL_DIAMETER * Math.PI) / (double) ENCODER_COUNT_PER_ROTATION;

    // ultrasonic sensors
     public static final int USS_PORT = 0; // 0 needs to be changed
    }

    public static final class OIConstants {

    // joysticks
		public static final int DRIVER = 0;
    public static final int OPERATOR = 1;

    
    // driver buttons
      // ball conveyer
      public static final int INTAKE_ON = 0;
      public static final int INTAKE_OFF = 0;

      public static final int DUMP_ON = 0;
      public static final int DUMP_OFF = 0;

    // operatior buttons 
      // WOF
      public static final int EXTEND_WOF = 1; // push up
      public static final int RETRACT_WOF = 2; // pull down
      public static final int SPIN_WOF = 3; // spin 3 times
      public static final int HOLD_WOF = 4; // hold on color


    }
    public static final class ConveyerConstants{

		public static final int INTAKE_LEFT = 0;
    public static final int INTAKE_RIGHT = 0;
    
		public static final int CLIP_LEFT = 0;
    public static final int CLIP_RIGHT = 0;
    
		public static final int DUMP_LEFT = 0;
		public static final int DUMP_RIGHT = 0;

    }
}
