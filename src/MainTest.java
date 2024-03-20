import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void getYear() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int result = Main.getYear(date);
        assertEquals(2023, result);
    }

    @Test
    void getMonth() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int result = Main.getMonth(date);
        assertEquals(3, result);
    }

    @Test
    void getDayOfMonth() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int result = Main.getDayOfMonth(date);
        assertEquals(1, result);
    }

    @Test
    void getDayOfWeek() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = Main.getDayOfWeek(date);
        assertEquals("WEDNESDAY", result);
    }
}