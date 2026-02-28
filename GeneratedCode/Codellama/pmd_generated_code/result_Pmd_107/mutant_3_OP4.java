import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code to append a string to the StringBuffer
            sb.append("Hello, World!");
        } else {
            // Code to append a different string to the StringBuffer
            sb.append("Goodbye, World!");
        }
        System.out.println(sb.toString());
    }

    private static boolean getCondition() {
        // Randomly generate a boolean value
        return Math.random() < 0.5;
    }
}