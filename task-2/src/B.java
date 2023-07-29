public class B {
    public static void main(String[] args) {
//        int firstNum = 10;
//        int secondNum = 4;

//        short firstNum = 4;
//        short secondNum = 8;

//        long firstNum = 100;
//        long secondNum = 2500;

//        byte firstNum = 2;
//        byte secondNum = 3;

//        double firstNum = 1.6;
//        double secondNum = 2.1;

        float firstNum = 1.8f;
        float secondNum = 2.8f;

        System.out.println("Сумма: " + sum(firstNum, secondNum));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(short a, short b) {
        return a + b;
    }

    static long sum(long a, long b) {
        return a + b;
    }

    static int sum(byte a, byte b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }
}
