package Lesson7;

public class Homework {

    public int sum(int[] sales) {
        int sum = 0;
        for (int s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public int middle(int[] sales) {
        int mid = sum(sales);
        return mid / sales.length;
    }

    public int getMaxDay(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int getMinDay(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }
    


}
