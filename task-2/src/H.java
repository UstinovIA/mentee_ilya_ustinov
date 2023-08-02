public class H {
    public static void main(String[] args) {
        outputNumbers(8, 10, 2, 234, 1, 7, -2, -5, 0);
    }

    static void outputNumbers(int... numbers) {
        for(int i: numbers) {
            System.out.println(i);
        }
    }
}
