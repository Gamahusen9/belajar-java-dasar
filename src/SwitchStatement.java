public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "H";

//        switch (nilai){
//            case "A" :
//                System.out.println("Wow, anda lulus dengan baik");
//                break;
//            case "B" :
//                System.out.println("Wow, nilai anda biasa saja");
//                break;
//            case "C" :
//                System.out.println("Wow, nilai anda cukup saja");
//                break;
//            default:
//                System.out.println("Err");
//                break;
//        }

        switch (nilai){
            case "A" -> System.out.println("Wow, keren");
            case "B", "C" -> System.out.println("Nilai Anda Cukup");
            default -> System.out.println("Lol");
            }
    }
}
