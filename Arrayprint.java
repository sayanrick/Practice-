import java.util.Arrays;

public class Arrayprint {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        displayForEach(array);

    }

    static void displayForEach(int[] arr){
        System.out.println("Printing array using for each loop:- ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
