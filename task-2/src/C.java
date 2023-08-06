public class C {
    public static void main(String[] args) {
        double firstNum = 4.6;
        double secondNum = 2.7;
        System.out.println(difference(firstNum, secondNum));
    }

    static short difference(double a, double b){
        double diff = a-b;
        return (short) diff;
    }
}
