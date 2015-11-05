import java.io.IOException;
import java.time.LocalTime;
import java.util.Locale;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //initialize logger
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            FileHandler fh = new FileHandler("./logfile.xml");
            logger.addHandler(fh);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE, "Failed to create a log file because of security policies.", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to create a log file because of an error O.", e);
        }
        logger.log(Level.INFO, "Program start");
        CurrentTime t = new CurrentTime();
        System.out.println(t.CheckTime(LocalTime.now(), Locale.getDefault()));
        logger.log(Level.INFO, "Output message gone");
    }
}
