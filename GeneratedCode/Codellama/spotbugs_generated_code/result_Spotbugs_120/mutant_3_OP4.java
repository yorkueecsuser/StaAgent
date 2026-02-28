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

        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            // code unreachable
            str = (String) objects[0];
            System.out.println(str);
        } else {
            // code unreachable
            str = (String) objects[2];
            System.out.println(str);
        }
    }

    private static boolean getCondition() {
        // returns true or false based on random number generation
    }
}