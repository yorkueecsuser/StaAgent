import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        boolean shouldRun = getCondition();
        if (shouldRun) {
            while (false) {
                // Unreachable code
                sb.append("This is unreachable code");
            }
        }
    }

    private static boolean getCondition() {
        return false;
    }
}