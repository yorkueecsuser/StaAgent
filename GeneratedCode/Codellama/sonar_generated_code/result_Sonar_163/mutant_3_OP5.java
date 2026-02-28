import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Mutated code starts here
        int value = getValue();
        switch(value) {
            case 1:
                // Unreachable code added to make switch statement unreachable
                throw new RuntimeException("This code is unreachable");
            default:
                // Original code
                sb.append(" is the first letter of the alphabet");
                System.out.println(sb.toString());
        }
    }

    // Helper method to get a dynamic value
    private static int getValue() {
        return Math.round(Math.random() * 10);
    }
}