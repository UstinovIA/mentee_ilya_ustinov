public class J {
    public static void main(String[] args) {
        outputIndexes();
    }

    static void outputIndexes() {
        for(int i = 1; i < 10; i++){
            if(i == 8) {
                break;
            }
            for(int j = 1; j < 10; j++){
                if(j % 2 == 0){
                    if(i % 2 == 1){
                        continue;
                    }
                    else {
                        System.out.println(i + "-" + j);
                    }
                }
            }
        }
    }
}
