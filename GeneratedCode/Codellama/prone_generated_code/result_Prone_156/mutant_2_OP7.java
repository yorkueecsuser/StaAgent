import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());

        // Unreachable while loop mutation
        while (false) {
            // This loop is always false and will never be executed
            sb.append("World");
        }
    }
}