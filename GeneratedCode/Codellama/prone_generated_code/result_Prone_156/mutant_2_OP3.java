import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
        if (getCondition()) {
            // unreachable code
            System.out.println("This code will never be reached");
        }
    }

    private static boolean getCondition() {
        // a method that returns a non-final variable or an equivalent method call
        return false;
    }
}