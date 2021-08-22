package math;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        int accNum = 1;
        // 5! = 5 * 4 * 3 * 2 * 1
        for (int i = 1; i <= input; i++) {
            accNum *= i;
        }
        System.out.println(accNum);


    }
}
