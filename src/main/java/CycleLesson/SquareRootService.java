package CycleLesson;

public class SquareRootService {

    public int calcSqrt(int x) {
        for (int i = 0; i <= x; i++) {
            if (i * i >= x){
                return i;
            }
        }
        return -1;
    }
}