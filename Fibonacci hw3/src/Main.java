import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many numbers to display?");
        Scanner input = new Scanner(System.in);
        int[] myArray = fib(input.nextInt());
        for (int i = 0; i < myArray.length; i++) {
            if(i%10 == 0 && i>1)
                System.out.println();
            System.out.print(myArray[i] + " ");

        }

    }

    public static int[] fib(int numbers) {

        int[] array = new int[numbers];

        if (numbers == 1) {
            array[0] = 0;
            return array;
        }
        else if (numbers == 2) {
            array[0] = 0;
            array[1] = 1;
            return array;
        }
        else{
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < array.length; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array;
        }

    }
}
