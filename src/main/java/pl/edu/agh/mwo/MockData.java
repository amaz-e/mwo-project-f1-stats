package pl.edu.agh.mwo;

import java.sql.Time;
import java.time.LocalDate;
import java.util.*;

public class MockData {
    public static Collection<PitStopData> GetMockPitStopCollection(){
        List<PitStopData> pitStopDataList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            PitStopData pitStopData =  new PitStopData();
            pitStopData.setLapNumber(10+i%3);
            pitStopData.setDate( new Date(System.currentTimeMillis())  );
            pitStopData.setPitDuration(10+2*i);
            pitStopData.setDriverNumber(i%5+1);
            pitStopDataList.add(pitStopData);
        }

        return pitStopDataList;
    }
}
