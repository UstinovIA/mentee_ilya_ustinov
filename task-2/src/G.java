public class G {
    public static void main(String[] args) {
        String str = "sTriNg";
        outputLowerCase(str);
        System.out.println();
        outputUpperCase(str);
    }

    static void outputLowerCase(String str) {
        String strLowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(strLowerCase.charAt(i));
        }
    }
    
    static void outputUpperCase(String str) {
        String strUpperCase = str.toUpperCase();
        for (char ch: strUpperCase.toCharArray()) {
            System.out.println(ch);
        }
    }
}
