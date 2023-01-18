package digi;

public class Lesson {
    public static void main(String[] args) {


        int[] array = {15, 10, 6, 0, 5, 0, 10, 15, 0};


        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
