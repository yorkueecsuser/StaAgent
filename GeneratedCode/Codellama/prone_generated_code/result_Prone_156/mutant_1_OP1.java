import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    }

    // Dead Store mutant
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        String xyz = "hello";
        sb.append(xyz);
        System.out.println(sb.toString());
    }
}