import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        String newStr = "Hello, World!";
        System.out.println(newStr.equals(newStr)); // Renaming mutant
    }

    public static String showBug() {
        return "Hello, World!";
    }
}