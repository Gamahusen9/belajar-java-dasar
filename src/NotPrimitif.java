public class NotPrimitif {
    public static void main(String[] args) {
        int iniInt = 100;
        Integer iniObject = iniInt;

        float iniShort = iniObject.floatValue();
        System.out.println(iniShort);

    }
}
