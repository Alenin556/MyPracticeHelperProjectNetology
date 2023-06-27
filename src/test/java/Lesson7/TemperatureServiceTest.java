package Lesson7;

import Lesson7.Arrays.TemperatureService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {
    @Test
    public void findMinTempDay() {
        TemperatureService service = new TemperatureService();

        int[] temps = {14, 13, 16, 23, 22,};

        int expectedDay = 1;
        int actualDay = service.getMinDay(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void findMinTemp1() {
        TemperatureService service = new TemperatureService();

        int[] temps = {16, 14, 30, 23, 22,};

        int expectedDay = 14;
        int actualDay = service.getMinTemp1(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    @Test
    public void findMinTemp2() {
        TemperatureService service = new TemperatureService();

        int[] temps = {16, 14, 30, 23, 22,};

        int expectedDay = 14;
        int actualDay = service.getMinTemp2(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
