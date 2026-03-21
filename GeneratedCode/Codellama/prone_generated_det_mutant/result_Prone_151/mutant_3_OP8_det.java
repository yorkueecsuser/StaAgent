import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String rybelqbb = "Hello, World!";
        System.out.println(rybelqbb.equals(rybelqbb)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}