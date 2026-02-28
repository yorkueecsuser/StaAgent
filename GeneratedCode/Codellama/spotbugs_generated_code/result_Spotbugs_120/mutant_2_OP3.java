import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        String str = (String) objects[1];
        System.out.println(str);

        // Unreachable if statement
        if (false) {
            // This code will never be executed because the condition is always false
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This is reachable code");
        }
    }
}