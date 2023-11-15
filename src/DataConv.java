public class DataConv {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(("123"));
        double dub1 = Double.parseDouble("123.456");
        boolean bul1 = Boolean.parseBoolean("false");
        char ch1 = "a".charAt(0);

        String str1 = String.valueOf(123);
        String str2 = String.valueOf(123.456);
        String str3 = String.valueOf("false");
        String str4 = String.valueOf('a');

        System.out.println(num1);
        System.out.println(dub1);
        System.out.println(bul1);
        System.out.println(ch1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
