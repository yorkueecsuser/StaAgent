import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        boolean condition = getCondition();
        if (condition) {
            // unreachable if-else branch
            System.out.println("This is an unreachable branch.");
        } else {
            System.out.println("This is the reachable branch.");
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}

public boolean getCondition() {
    return false;
}