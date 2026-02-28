import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            sb.append("This is an unreachable for loop mutant");
        }
    }
}