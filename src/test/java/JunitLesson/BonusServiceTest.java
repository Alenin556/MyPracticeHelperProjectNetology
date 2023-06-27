package JunitLesson;

import MavenLesson5.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    BonusService service = new BonusService();

    @Test
    public void test1() {

        int expected = 150;
        int actual = service.calcBonus(5_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){

            int expected = 50;
            int actual = service.calcBonus(5_000, false);

            Assertions.assertEquals(expected,actual);



        }
}
