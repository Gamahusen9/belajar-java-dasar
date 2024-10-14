public class MethodOverLoading {
    public static void main(String[] args) {
        sayHello("Gama", 17);
        sayHello("Gama", 3, "PPLG");
    }

    static void sayHello(String namee, int agess){
        System.out.println("Halo " + namee + ", umur kamu : " + agess);
    }

    static void sayHello(String name, int absenNo, String rayon){
        System.out.println("Halo" + name + ", absen kamu: " + absenNo + " dan data rayon kamu adalah: " + rayon);
    }
}
