package org.firstinspires.ftc.teamcode;
import android.util.Size;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagLibrary;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.ArrayList;
import java.util.List;

import




@TeleOp
public class Vision extends LinearOpMode {


    AprilTagDetection tagofInt = null;



    @Override
    public void runOpMode() throws InterruptedException { // init

        // April Tag Processer / Settings

        AprilTagProcessor tagProcessor1 = new AprilTagProcessor.Builder()

                .setDrawAxes(true)
                .setDrawCubeProjection(true)
                .setDrawTagID(true)
                .setDrawTagOutline(true)
                .setTagLibrary(AprilTagCustomLibrary.getSmallLibrary())
                .build();


        // Vision portal Settings

        VisionPortal visionPortal1 = new VisionPortal.Builder()

                .addProcessor(tagProcessor1)
                .setCamera(hardwareMap.get(WebcamName.class, "Webcam 1"))
                .setCameraResolution(new Size(640, 480))
                .build();

        // ------------------------------------------------------------


        waitForStart();

        while (isStarted() && !isStopRequested()) { // on start

            boolean tagfound = false;

            if(tagProcessor1.getDetections().size() > 0) {
                apriltagDetections tag = tagProcessor1.getDetections().get(0);

                telemetry.addLine(String.format("XYZ %6.2f %6.2f %6.2f", tag.ftcPose.x, tag.ftcPose.y, tag.ftcPose.z));







                    }

            }



            }


            }





