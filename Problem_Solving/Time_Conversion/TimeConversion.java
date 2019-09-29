import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] tokens = s.split(":");
        String hours = tokens[0];
        String minutes = tokens[1];
        String seconds = tokens[2].substring(0,2);
        String timeofDay = tokens[2].substring(2,4);
        String timeConvert = "";


        int hourofDay;

        if(timeofDay.equals("PM")) {
            if(Integer.parseInt(hours) < 12){
                hourofDay = Integer.parseInt(hours);
                hourofDay = hourofDay + 12;
                hours = Integer.toString(hourofDay);
            }
        }
        if(timeofDay.equals("AM")){
            if(Integer.parseInt(hours) == 12){
                hours = "00";
            }
        }
        timeConvert = hours + ":" + minutes + ":" + seconds;


        return timeConvert;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
