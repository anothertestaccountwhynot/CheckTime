import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class CurrentTime {
    public String CheckTime(LocalTime localTime, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("lang", locale);
        //if  6 < time < 9
        if (((LocalTime.of(6, 0, 0).isBefore(localTime)) && (LocalTime.of(9, 0, 0)).isAfter(localTime)) || LocalTime.of(6,0,0).equals(localTime)) {
            return bundle.getString("morning");
        }
        // if 9 < time <19
        else if (((LocalTime.of(9, 0, 0).isBefore(localTime)) && (LocalTime.of(19, 0, 0)).isAfter(localTime)) || LocalTime.of(9,0,0).equals(localTime)) {
            return bundle.getString("day");
        }
        // if 19 < time < 23
        else if (((LocalTime.of(19, 0, 0).isBefore(localTime)) && (LocalTime.of(23, 0, 0)).isAfter(localTime)) || LocalTime.of(19,0,0).equals(localTime)) {
            return bundle.getString("evening");
        }
        //if 23 < time < 6
        else if ((((LocalTime.of(23, 0, 0).isBefore(localTime)) &&
                (LocalTime.of(23, 59, 59)).isAfter(localTime)) || ((LocalTime.of(0,0,0).isBefore(localTime))&& (LocalTime.of(6,0,0).isAfter(localTime)))) ||
                LocalTime.of(23,0,0).equals(localTime) || (LocalTime.of(0,0,0).equals(localTime))) {
            return bundle.getString("night");
        }
        else return "Fail";
    }
}