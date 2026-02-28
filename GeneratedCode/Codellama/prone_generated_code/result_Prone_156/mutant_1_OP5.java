import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());

        // Unreachable switch statement mutant
        switch (false) {
            case true:
                System.out.println("This code is unreachable");
                break;
        }
    }
}