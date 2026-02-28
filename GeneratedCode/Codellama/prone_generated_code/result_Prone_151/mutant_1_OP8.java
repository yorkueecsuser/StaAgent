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

class SelfEqualsRenamed {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEqualsRenamed
    }

    public static String showBug() {
        return "Hello, World!";
    }
}