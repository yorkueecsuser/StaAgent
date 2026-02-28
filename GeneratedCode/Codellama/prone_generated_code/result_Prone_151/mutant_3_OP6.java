import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // unreachable for loop
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}