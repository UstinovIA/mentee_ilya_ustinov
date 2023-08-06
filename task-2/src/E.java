public class E {
    public static void main(String[] args) {
        String name = "Ilya";
        //name = "Alexandr";
        outputName(name);
    }

    static void outputName(String name){
        String output = name.length() > 5 ? name.toUpperCase() : name.toLowerCase();
        System.out.println(output);
    }
}
