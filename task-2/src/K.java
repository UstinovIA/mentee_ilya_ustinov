public class K {
    public static void main(String[] args) {
        exception();
    }

    static void exception(){
        try {
            throw new Exception("Вызвано исключение");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Секция, которая выполняется всегда");
        }
    }
}
