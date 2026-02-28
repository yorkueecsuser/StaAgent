import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}

// Mutant 1: Renaming variable "ch" to "c"
class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}

// Mutant 2: Renaming variable "sb" to "builder"
class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder builder = new StringBuilder(ch);
        builder.append("hello");
        System.out.println(builder.toString());
    }
}

// Mutant 3: Renaming variable "args" to "parameters"
class StringBuilderInitWithCharBug {
    public static void main(String[] parameters) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}