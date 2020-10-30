public class Main{
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static int factorial(int num) {
        if(num == 1 || num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}