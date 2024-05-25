package pl.edu.agh.mwo;

import java.util.Date;

public class PitStopData {

    private int session_key;
    private int meeting_key;
    private Date date;
    private int driver_number;
    private float pit_duration;
    private int lap_number;

    public PitStopData(int sessionKey, int meetingKey, Date date, int driverNumber, float pitDuration, int lapNumber) {
        this.session_key = sessionKey;
        this.meeting_key = meetingKey;
        this.date = date;
        this.driver_number = driverNumber;
        this.pit_duration = pitDuration;
        this.lap_number = lapNumber;
    }


    public int getSession_key() {
        return session_key;
    }

    public void setSession_key(int session_key) {
        this.session_key = session_key;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public void setMeeting_key(int meeting_key) {
        this.meeting_key = meeting_key;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }

    public float getPit_duration() {
        return pit_duration;
    }

    public void setPit_duration(float pit_duration) {
        this.pit_duration = pit_duration;
    }

    public int getLap_number() {
        return lap_number;
    }

    public void setLap_number(int lap_number) {
        this.lap_number = lap_number;

    }
}
