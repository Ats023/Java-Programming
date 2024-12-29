import java.util.*;
import java.time.*;

public class Practice2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate specific = LocalDate.of(2023,06,30);

        System.out.println(specific);
        LocalDate next = specific.plusDays(1);
        System.out.println(next);

        LocalDateTime current = LocalDateTime.now();
        Instant currInstant = Instant.now();

        System.out.println("current: " + current);
        System.out.println("current instant: " + currInstant);
    }
}
