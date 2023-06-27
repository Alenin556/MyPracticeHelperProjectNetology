package JunitLesson;

import MavenLesson5.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedBonusServiceTest {
    BonusService service = new BonusService();

    @ParameterizedTest
    @CsvSource({
            "150,5000,true",
            "50,5000,false"
    })
    public void test(int expected, int amount, boolean isRegistered) {

        int actual = service.calcBonus(amount,isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
