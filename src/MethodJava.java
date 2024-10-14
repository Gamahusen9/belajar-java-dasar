public class MethodJava {
    public static void main(String[] args) {
//        pengenalanText("Gama Husen", "17", "PPLG");
//        valueOfStudent(20, 30, 20, "Rika", "PMN");
        System.out.println(valueAritmatika(20, 30, 40));
    }


    static void pengenalanText(String name, String ages, String major){
        System.out.println("Halo Nama Saya: " + name + ", " + "Dan Umur Saya: " + ages);
        System.out.println("Dan Major Saya: " + major);
    }

    static void valueOfStudent(int nilaiAwal, int nilaiKedua, int nilaiKetiga, String name, String major){
        int countAllNilai = nilaiAwal + nilaiKedua + nilaiKetiga;
        int[] kumpulanNilai = {
                0, 0, 0
        };

        kumpulanNilai[0] = nilaiAwal;
        kumpulanNilai[1] = nilaiKedua;
        kumpulanNilai[2] = nilaiKetiga;


        final float rataRata = countAllNilai / kumpulanNilai.length;
        System.out.println(rataRata);

    }

    static int valueAritmatika(int angkaFirst, int angkaSecond, int angkaThird){
        int aritmatika = angkaFirst + angkaSecond + angkaThird;

        return aritmatika;
    }


}
