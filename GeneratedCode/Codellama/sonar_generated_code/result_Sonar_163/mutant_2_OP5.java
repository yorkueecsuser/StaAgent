import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Unreachable switch statement mutant
        int value = getValue(); // non-final variable to avoid compile-time constant
        switch(value) {
            case 1:
                // code
                break;
            default:
                // default code
                break;
        }
    }
}