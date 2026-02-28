import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        // Mutant code
        boolean condition = getCondition();
        if (condition) {
            sb.append(" This is a mutant code");
        } else {
            sb.append(" This is also a mutant code");
        }
        System.out.println(sb.toString());
    }

    private static boolean getCondition() {
        return false;
    }
}