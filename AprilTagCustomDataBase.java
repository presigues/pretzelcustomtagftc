package org.firstinspires.ftc.teamcode;


import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Quaternion;
import org.firstinspires.ftc.vision.apriltag.AprilTagGameDatabase;
import org.firstinspires.ftc.vision.apriltag.AprilTagLibrary;

public class AprilTagCustomDataBase {

    public static AprilTagLibrary getSmallLibrary(){
        return new AprilTagLibrary.Builder()
                .addTag(
                        1,
                        "Pluto",
                        6,
                        new VectorF(5, 10, 15),
                        DistanceUnit.INCH,
                        Quaternion.identityQuaternion()

                        )

                .addTag(
                        2,
                        "Jupiter",
                        6,
                        new VectorF(5, 10, 15),
                        DistanceUnit.INCH,
                        Quaternion.identityQuaternion()

                )

                .addTag(
                        3,
                        "Mars",
                        6,
                        new VectorF(5, 10, 15),
                        DistanceUnit.INCH,
                        Quaternion.identityQuaternion()

                )

                .addTags(AprilTagCustomDataBase.getCurrentgameTagLibrary())
                .build();
    }
}
