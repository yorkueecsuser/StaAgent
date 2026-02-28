import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This for loop will never be executed
        }
    }
}