public class L {
    public static void main(String[] args) {
        exception();
    }

    static void exception(){
        try {
            throw new Exception("Вызвано исключение");
        }
        catch (Exception ex){
            System.exit(0);
        }
        finally {
            System.out.println("Секция, которая выполняется всегда");
        }
    }
}
