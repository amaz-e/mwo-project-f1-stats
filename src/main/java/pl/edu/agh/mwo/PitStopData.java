package pl.edu.agh.mwo;

import java.util.Date;

public class PitStopData {
    private int sessionKey;
    private int meetingKey;
    private Date date;
    private int driverNumber;
    private float pitDuration;
    private int lapNumber;


    public int getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(int sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public void setMeetingKey(int meetingKey) {
        this.meetingKey = meetingKey;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public float getPitDuration() {
        return pitDuration;
    }

    public void setPitDuration(float pitDuration) {
        this.pitDuration = pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }
}
