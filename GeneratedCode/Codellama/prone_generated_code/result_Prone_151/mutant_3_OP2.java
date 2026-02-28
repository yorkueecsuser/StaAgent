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

// Mutant 1: Duplicate assignment statement
class SelfEqualsMutant1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }
}

// Mutant 2: Duplicate assignment statement
class SelfEqualsMutant2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        String str2 = "Hello, World!";
    }

    public static String showBug() {
        return "Hello, World!";
    }
}