import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        while (false) {
            // insert unreachable while loop
            System.out.println("This code is unreachable");
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}