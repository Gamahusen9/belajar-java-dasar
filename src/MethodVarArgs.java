public class MethodVarArgs {
    public static void main(String[] args) {
        sayCongrats("Gama Husen", 90,80,70, 30, 20);
    }


    static void sayCongrats(String name, int... values){
        var total = 0;

        for (var value : values)
        {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Anda lulus dengan nilai: " + finalValue);
        } else{
            System.out.println("Anda gagal lulus dengan nilai: " + finalValue);
        }

    }

}
