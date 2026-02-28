import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean condition = getCondition();
        if (condition) {
            System.out.println(str.equals(str)); // BUG: SelfEquals
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}