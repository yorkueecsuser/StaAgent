import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false; // This method always returns false
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42);

        boolean condition = getCondition();
        switch (condition? 1 : 0) { // This switch statement is unreachable as the condition always evaluates to false
            case 1:
                System.out.println("This is an unreachable statement");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}