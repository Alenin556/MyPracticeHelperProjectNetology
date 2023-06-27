package Lesson7;

import Lesson7.Strings.StringsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsServiceTest {

    @Test
    public void findLongest() {
        StringsService service = new StringsService();

        String s1 = "Hello";
        String s2 = "Goodbye";

        String expected = s2;
        String actual = service.longestString(s1,s2);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findAnotherLongest() {
        StringsService service = new StringsService();

        String s1 = "Hello Man!";
        String s2 = "Goodbye";

        String expected = s1;
        String actual = service.longestString(s1,s2);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findLongestBetweenEqual() {
        StringsService service = new StringsService();

        String s1 = "Hello";
        String s2 = "Hello";

        String expected = s2;
        String actual = service.longestString(s1,s2);

        Assertions.assertEquals(expected,actual);
    }
}
