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

        // Mutant: Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop is unreachable, so the code inside it is not executed.
            // However, the loop is still syntactically valid.
            System.out.println("This statement is not executed.");
        }
    }
}