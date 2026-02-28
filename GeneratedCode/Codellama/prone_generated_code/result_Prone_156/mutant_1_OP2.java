import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
        // Mutant 1: Duplicate the assignment statement for ch
        ch = 'a';
        // Mutant 2: Duplicate the assignment statement for sb
        sb = new StringBuilder(ch);
    }
}