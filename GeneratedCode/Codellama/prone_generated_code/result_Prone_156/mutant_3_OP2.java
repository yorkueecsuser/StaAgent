import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}

// Mutant 1: Duplicate the assignment statement for 'ch'
char ch = 'a';
char ch = 'a';
StringBuilder sb = new StringBuilder(ch);
sb.append("hello");
System.out.println(sb.toString());

// Mutant 2: Duplicate the assignment statement for'sb'
char ch = 'a';
StringBuilder sb = new StringBuilder(ch);
StringBuilder sb = new StringBuilder(ch);
sb.append("hello");
System.out.println(sb.toString());