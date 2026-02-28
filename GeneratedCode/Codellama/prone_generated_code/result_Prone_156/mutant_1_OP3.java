import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
        if (false) {
            // This if statement is always false and will never be executed
            System.out.println("This statement is unreachable");
        }
    }
}