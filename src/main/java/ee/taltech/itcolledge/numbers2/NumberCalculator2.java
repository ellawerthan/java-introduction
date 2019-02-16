package ee.taltech.itcolledge.numbers2;

public class NumberCalculator2 {

    //todo create method that takes almost infinite amount of variables
    // hint: varargs

    public static int sum(int ... a) {
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }
}
