import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Mutation Operator: Unreachable switch statement
        int value = getValue(); // getValue() returns a non-final, non-compile-time constant value
        switch(value) {
            case 1:
                // code block that is never executed
                break;
            default:
                // code block that is always executed
                break;
        }

        // AVOID unreachable statement errors
        boolean condition = getCondition();
        if (condition) {
            // code block that is sometimes executed
        } else {
            // code block that is sometimes executed
        }
    }

    public static int getValue() {
        return new Random().nextInt(10);
    }

    public static boolean getCondition() {
        return new Random().nextBoolean();
    }
}