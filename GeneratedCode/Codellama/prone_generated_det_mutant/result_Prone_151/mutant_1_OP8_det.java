import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String eptvspyj = "Hello, World!";
        System.out.println(eptvspyj.equals(eptvspyj)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}