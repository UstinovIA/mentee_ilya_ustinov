public class F {
    public static void main(String[] args) {
        int input = 1;
        System.out.println(output(input));
    }

    static String output(int input) {
        switch (input){
            case 1:
            case 2:
                return "Выводим " + input;
            case 3:
                return "Выводим " + (input + 1);
            default:
                return "НЕВЕРНЫЙ ФОРМАТ";
        }
    }
}
