/**
 * Created by Robert on 11.11.2016.
 */
public class teema32 {public static String getFormattedTimeString(long timeInSeconds) {




    String timeStr = new String();
    long sec_term = 1;
    long min_term = 60 * sec_term;
    long hour_term = 60 * min_term;
    long result = Math.abs(timeInSeconds);

    int hour = (int) (result / hour_term);
    result = result % hour_term;
    int min = (int) (result / min_term);
    result = result % min_term;
    int sec = (int) (result / sec_term);

    if (timeInSeconds < 0) {
        timeStr = "-";
    }
    if (hour > 0) {
        timeStr += hour + "h ";
    }
    if (min > 0) {
        timeStr += min + "m ";
    }
    if (sec > 0) {
        timeStr += sec + "s ";
    }
    return timeStr;
}
    public static void main(String args[]){
        System.out.printf(getFormattedTimeString(64089));
    }

}

