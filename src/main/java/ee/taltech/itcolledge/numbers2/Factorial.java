package ee.taltech.itcolledge.numbers2;

public class Factorial {

    public static long factorial(int n) {
        //todo rewrite with tertiary if statement (using ? and :) (colon, not a smiley)
        return (1 > n ? 1 : n * factorial(n - 1));
    }

    public static void main(String[] args) {
        //todo call factorial function with inputs 0, 2, 5, 10, 15, 20
        // what happens on factorial 21?
        factorial(0);
        factorial(2);
        factorial(5);
        factorial(10);
        factorial(15);
        factorial(20);
    }
}
