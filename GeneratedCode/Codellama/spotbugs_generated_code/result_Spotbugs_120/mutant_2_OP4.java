import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        String str = (String) objects[1];
        System.out.println(str);
    }

    // Unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        String str = (String) objects[1];
        System.out.println(str);

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Reachable code
            System.out.println("This code is reachable");
        }
    }
}