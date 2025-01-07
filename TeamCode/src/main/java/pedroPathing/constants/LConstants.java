package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        DriveEncoderConstants.forwardTicksToInches = -0.3568;
        DriveEncoderConstants.strafeTicksToInches = 3.5987;
        DriveEncoderConstants.turnTicksToInches = -0.0141;

        DriveEncoderConstants.robot_Width = 1;
        DriveEncoderConstants.robot_Length = 1;

        DriveEncoderConstants.leftFrontEncoderDirection = Encoder.REVERSE;
        DriveEncoderConstants.rightFrontEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.leftRearEncoderDirection = Encoder.REVERSE;
        DriveEncoderConstants.rightRearEncoderDirection = Encoder.REVERSE;

    }
}




