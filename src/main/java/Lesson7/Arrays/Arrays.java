package Lesson7.Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[3] = 11;

        System.out.println(arr1[3]);
        System.out.println(java.util.Arrays.toString(arr1));

        String[] stringArr = new String[5]; //все ячейки ссылочных типов данных хранят ссылки, если там ничего не лежит, то ячейка хранит в себе null

        System.out.println(stringArr[0]);

        int[] arr2 = {1,2,3,4};
        System.out.println(java.util.Arrays.toString(arr2));



    }

}
