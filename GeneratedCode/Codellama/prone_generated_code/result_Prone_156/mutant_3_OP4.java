import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        if (false) {
            System.out.println("This statement is unreachable");
        } else {
            System.out.println(sb.toString());
        }
    }
}