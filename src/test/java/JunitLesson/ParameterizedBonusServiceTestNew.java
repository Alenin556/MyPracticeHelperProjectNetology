package JunitLesson;

import MavenLesson5.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedBonusServiceTestNew {
    BonusService service = new BonusService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void test(int expected, int amount, boolean isRegistered) {

        int actual = service.calcBonus(amount,isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
