import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}

// Mutant 1: Renaming variable "str" to "s"
class SelfEqualsMutant1 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.equals(s)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}

// Mutant 2: Renaming variable "str" to "string"
class SelfEqualsMutant2 {
    public static void main(String[] args) {
        String string = "Hello, World!";
        System.out.println(string.equals(string)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}