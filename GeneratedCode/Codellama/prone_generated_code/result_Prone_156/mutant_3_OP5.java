import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());

        // Unreachable switch statement mutant
        boolean condition = false;
        switch(condition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is unreachable");
                break;
        }
    }
}