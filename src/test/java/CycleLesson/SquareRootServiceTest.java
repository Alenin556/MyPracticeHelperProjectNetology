package CycleLesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootServiceTest {
    @Test
    public void shoudSquare() {
        SquareRootService service = new SquareRootService();

        int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions.assertEquals(expected,actual);


    }
}
