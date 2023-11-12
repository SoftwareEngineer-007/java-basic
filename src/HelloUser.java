public class HelloUser {
    public static void main(String[] args) {
        var hi = "Hello, " + System.getProperty("user.name") + "!";
        System.out.println(hi);
    }
}
