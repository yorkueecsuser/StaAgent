import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Mutation Operator: Renaming
        // Original variable name: sb
        // New variable name: sb1
        StringBuilder sb1 = new StringBuilder('A');
        sb1.append(" is the first letter of the alphabet");
        System.out.println(sb1.toString());
    }
}