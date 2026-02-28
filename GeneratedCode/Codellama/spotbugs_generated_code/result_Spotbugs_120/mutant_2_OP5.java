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

        // Mutant 1: Unreachable switch statement
        int value = 0;
        switch(value) {
            case 0:
                System.out.println("Reached unreachable switch statement");
                break;
            default:
                break;
        }
    }
}