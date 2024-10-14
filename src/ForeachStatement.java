public class ForeachStatement {
    public static void main(String[] args) {
        String[] dataMarketing = {
             "Mas Regi", "Marketing 1", "Marketing 2", "Marketing 3"
        };

        System.out.println(dataMarketing.length);

        for (var i = 0; i < dataMarketing.length; i++){
            System.out.println(dataMarketing[i]);
        }

        System.out.println("");
        System.out.println("");
        for (var value : dataMarketing){
            System.out.println(value);
        }
    }
}
