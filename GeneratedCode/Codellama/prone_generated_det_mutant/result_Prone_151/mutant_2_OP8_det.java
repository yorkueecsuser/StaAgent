import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String kvdplaut = "Hello, World!";
        System.out.println(kvdplaut.equals(kvdplaut)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}