package com.o3dr.services.android.lib.drone.calibration.magnetometer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Fredia Huya-Kouadio on 5/3/15.
 */
public class MagnetometerCalibrationReport implements Parcelable {

    /**
     * RMS milligauss residuals
     */
    private float fitness;

    /**
     * X offset
     */
    private float xOffset;

    private float yOffset;

    private float zOffset;

    private float xDiag;

    private float yDiag;

    private float zDiag;

    private float xOffDiag;

    private float yOffDiag;

    private float zOffDiag;

    private boolean autoSaved;

    public MagnetometerCalibrationReport(){}

    public MagnetometerCalibrationReport(boolean autoSaved, float fitness, float xOffset, float yOffset, float zOffset,
                                         float xDiag, float yDiag, float zDiag,
                                         float xOffDiag, float yOffDiag, float zOffDiag) {
        this.autoSaved = autoSaved;
        this.fitness = fitness;
        this.xDiag = xDiag;
        this.xOffDiag = xOffDiag;
        this.xOffset = xOffset;
        this.yDiag = yDiag;
        this.yOffDiag = yOffDiag;
        this.yOffset = yOffset;
        this.zDiag = zDiag;
        this.zOffDiag = zOffDiag;
        this.zOffset = zOffset;
    }

    public boolean isAutoSaved() {
        return autoSaved;
    }

    public void setAutoSaved(boolean autoSaved) {
        this.autoSaved = autoSaved;
    }

    public float getFitness() {
        return fitness;
    }

    public void setFitness(float fitness) {
        this.fitness = fitness;
    }

    public float getxDiag() {
        return xDiag;
    }

    public void setxDiag(float xDiag) {
        this.xDiag = xDiag;
    }

    public float getxOffDiag() {
        return xOffDiag;
    }

    public void setxOffDiag(float xOffDiag) {
        this.xOffDiag = xOffDiag;
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyDiag() {
        return yDiag;
    }

    public void setyDiag(float yDiag) {
        this.yDiag = yDiag;
    }

    public float getyOffDiag() {
        return yOffDiag;
    }

    public void setyOffDiag(float yOffDiag) {
        this.yOffDiag = yOffDiag;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

    public float getzDiag() {
        return zDiag;
    }

    public void setzDiag(float zDiag) {
        this.zDiag = zDiag;
    }

    public float getzOffDiag() {
        return zOffDiag;
    }

    public void setzOffDiag(float zOffDiag) {
        this.zOffDiag = zOffDiag;
    }

    public float getzOffset() {
        return zOffset;
    }

    public void setzOffset(float zOffset) {
        this.zOffset = zOffset;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.fitness);
        dest.writeFloat(this.xOffset);
        dest.writeFloat(this.yOffset);
        dest.writeFloat(this.zOffset);
        dest.writeFloat(this.xDiag);
        dest.writeFloat(this.yDiag);
        dest.writeFloat(this.zDiag);
        dest.writeFloat(this.xOffDiag);
        dest.writeFloat(this.yOffDiag);
        dest.writeFloat(this.zOffDiag);
        dest.writeByte(autoSaved ? (byte) 1 : (byte) 0);
    }

    private MagnetometerCalibrationReport(Parcel in) {
        this.fitness = in.readFloat();
        this.xOffset = in.readFloat();
        this.yOffset = in.readFloat();
        this.zOffset = in.readFloat();
        this.xDiag = in.readFloat();
        this.yDiag = in.readFloat();
        this.zDiag = in.readFloat();
        this.xOffDiag = in.readFloat();
        this.yOffDiag = in.readFloat();
        this.zOffDiag = in.readFloat();
        this.autoSaved = in.readByte() != 0;
    }

    public static final Parcelable.Creator<MagnetometerCalibrationReport> CREATOR = new Parcelable.Creator<MagnetometerCalibrationReport>() {
        public MagnetometerCalibrationReport createFromParcel(Parcel source) {
            return new MagnetometerCalibrationReport(source);
        }

        public MagnetometerCalibrationReport[] newArray(int size) {
            return new MagnetometerCalibrationReport[size];
        }
    };
}
