package CycleLesson;

public class СycleLessonFor {
    public static void main(String[] args) {

        int x = 5;

        while (x < 10) {
            x++;
            System.out.println("Hello");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue; //пропускает
            }
            if (i == 6) {
                break; //прекращает
            }
            System.out.println(i);
        }
    }
}
