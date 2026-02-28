import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String xxxxx = "xxxxxx"; // Dead Store
        System.out.println(str.equals(str)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}