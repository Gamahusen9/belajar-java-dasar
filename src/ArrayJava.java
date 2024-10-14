public class ArrayJava {
    public static void main(String[] args) {
        String[] name;
        name = new String[3];
        name[0] = "Gama";
        name[1] = "Rika";
        name[2] = "Ghalib";

        System.out.println(name[2]);

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        String[] listName = {
                "Gama", "Rika", "Ghalib", "Pak Dhiki", "Mas Ridho", "Mas Vale"

        };

//        System.out.println(listName);

        String[][] listMarketing = {
                {"Mas Regi", "Mas Hoka"},
                {"Mas Zaki", "Mas Ruri"}
        };

        String[] member1 = listMarketing[0];
        System.out.println(member1[0]);

        System.out.println(listMarketing[0][1]);

    }
}
