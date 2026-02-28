import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 0:
                sb.append("Hello");
                break;
            case 1:
                sb.append("World");
                break;
            default:
                sb.append("!");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}