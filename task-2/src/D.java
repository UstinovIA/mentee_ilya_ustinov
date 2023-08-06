public class D {
    public static void main(String[] args) {
        String name = "Ilya";
        //name = "Alexandr";
        outputName(name);
    }

    static void outputName(String name) {
        if(name.length() > 5) {
            System.out.println(name.toUpperCase());
        }
        else {
            System.out.println(name.toLowerCase());
        }
    }
}
