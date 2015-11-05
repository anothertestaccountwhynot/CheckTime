import junit.framework.TestCase;
import org.junit.Test;
import java.time.LocalTime;
import java.util.Locale;

public class TestCurrentTime extends TestCase {
    @Test
    public void testCheckTimeEnMorningBorder() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Good morning, world!", "Good morning, World!", test.CheckTime(LocalTime.of(6,0,0), new Locale("en","US", "WIN")));
    }
    @Test
    public void testCheckTimeEnMorning() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Good morning, world!", "Good morning, World!", test.CheckTime(LocalTime.of(7,33,32), new Locale("en","US", "WIN")));
    }

    @Test
    public void testCheckTimeEnDay() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Good day, world!", "Good day, World!", test.CheckTime(LocalTime.of(15,22,33), new Locale("en","US", "WIN")));
    }
    @Test
    public void testCheckTimeEnEvening() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Good evening, world!", "Good evening, World!", test.CheckTime(LocalTime.of(22,35,33), new Locale("en","US", "WIN")));
    }
    @Test
    public void testCheckTimeEnNight() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Good night, world!", "Good night, World!", test.CheckTime(LocalTime.of(23,35,33), new Locale("en","US", "WIN")));
    }

    @Test
    public void testCheckTimeRuNightBorder() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Доброй ночи, Мир!", "Доброй ночи, Мир!", test.CheckTime(LocalTime.of(23,0,0), new Locale("ru","RU", "WIN")));
    }

    @Test
    public void testCheckTimeUaNightBorder() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Доброї ночі, Світ!", "Доброї ночі, Світ!", test.CheckTime(LocalTime.of(0,0,0), new Locale("uk","UA", "WIN")));
    }
    @Test

    public void testCheckTimeUaNight() {
        CurrentTime test = new CurrentTime();
        assertEquals("Must be - Доброї ночі, Світ!", "Доброї ночі, Світ!", test.CheckTime(LocalTime.of(2,2,2), new Locale("uk","UA", "WIN")));
    }
}
