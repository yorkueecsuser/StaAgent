import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // code
        }
    }

    private static boolean getCondition() {
        return false;
    }
}