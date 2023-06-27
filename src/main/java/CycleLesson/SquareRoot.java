package CycleLesson;

public class SquareRoot {
    public static void main(String[] args) {

        int x = 36;

        for (int i = 0; i <= x; i++) {
            if (i * i >= x){
                System.out.println("Квадратный корень " + x + " равен " + i);
                break;
            }
        }
    }
}
