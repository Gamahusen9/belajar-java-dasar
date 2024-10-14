public class BreakContinue {
    public static void main(String[] args) {
//        var container = 1;
//
//        while (true){
//            System.out.println("Perulangan Ke-"  + container);
//            container++;
//
//            if (container > 1000){
//                break;
//            }
//        }

        for (var i = 1; i < 10; i++){
            if (i % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil Ke-" + i);
        }
    }
}
