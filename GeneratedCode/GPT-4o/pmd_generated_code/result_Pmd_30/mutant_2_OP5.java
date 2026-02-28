import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable switch statement
        int nonFinalVariable = getNonFinalValue();
        switch (nonFinalVariable) {
            case 999:  // This case will never be hit assuming getNonFinalValue() never returns 999
                System.out.println("Unreachable case 999");
                break;
            default:
                break;
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable switch statement
        int anotherNonFinalValue = getAnotherNonFinalValue();
        switch (anotherNonFinalValue) {
            case 888:  // This case will never be hit assuming getAnotherNonFinalValue() never returns 888
                System.out.println("Unreachable case 888");
                break;
            default:
                break;
        }
    }

    private static int getNonFinalValue() {
        return -1; // This value should never match the unreachable case in the switch
    }

    private static int getAnotherNonFinalValue() {
        return -1; // This value should never match the unreachable case in the switch
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}