package pl.edu.agh.mwo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class PitstopParser {

    public static String stream(URL url) {
        try (InputStream input = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            return json.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void JSONtoObjectList() throws MalformedURLException {
        String jsonArray = stream(new URL("https://api.openf1.org/v1/pit?session_key=9515"));
        //System.out.println(jsonArray);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<PitStopData>>() {}.getType();
        List<PitStopData> gsonList = gson.fromJson(jsonArray, listType);


    }



}
