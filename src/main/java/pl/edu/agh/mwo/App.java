package pl.edu.agh.mwo;


import java.net.MalformedURLException;
import static pl.edu.agh.mwo.PitstopParser.JSONtoObjectList;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws MalformedURLException {

        CalculateStatsAndPrint.CalculatePitStopsCount(MockData.GetMockPitStopCollection());


        System.out.println( "Hello World!" );
        JSONtoObjectList();
    }
}
