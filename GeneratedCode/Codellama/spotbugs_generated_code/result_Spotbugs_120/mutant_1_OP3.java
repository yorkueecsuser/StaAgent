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

        // Mutant 1: Insert unreachable if statement
        if (false) {
            System.out.println("Unreachable code");
        }

        // Mutant 2: Insert unreachable while loop
        while (false) {
            System.out.println("Unreachable loop");
        }

        // Mutant 3: Insert unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable for loop");
        }

        // Mutant 4: Insert unreachable if-else statement
        if (true) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }

        // Mutant 5: Insert unreachable switch statement
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Reachable code");
                break;
            case 2:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}