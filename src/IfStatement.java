public class IfStatement {
    public static void main(String[] args) {
        int nilai = -20;
        int minimalNilai = 75;
        if(nilai <= minimalNilai && nilai > 0){
            System.out.println("Nilai kamu Jelek");
        } else if (nilai > minimalNilai && nilai <= 100) {
            System.out.println("Nilai Kamu Bagus");
        } else{
            System.out.println("System Eror");
        }
    }
}
