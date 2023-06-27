package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTest {

    @Test
    public void sumTest(){
        Homework homework = new Homework();

        int[] sales = {20, 10, 10, 10, 10};

        int expectedSum = 60;
        int actualSum = homework.sum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void midTest(){
        Homework homework = new Homework();

        int[] sales = {10, 10, 10, 10, 10};

        int expectedMid = 10;
        int actualMid = homework.middle(sales);

        Assertions.assertEquals(expectedMid, actualMid);
    }

    @Test
    public void minDayTest(){
        Homework homework = new Homework();

        int[] sales = {10, 5, 10, 10, 10};

        int expectedMinDay = 1;
        int actualMinDay = homework.getMinDay(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void maxDayTest(){
        Homework homework = new Homework();

        int[] sales = {10, 5, 15, 10, 10};

        int expectedMaxDay = 2;
        int actualMaxDay = homework.getMaxDay(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }


}
