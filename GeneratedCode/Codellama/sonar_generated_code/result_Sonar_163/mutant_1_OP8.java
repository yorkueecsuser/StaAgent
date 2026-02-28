import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Mutation Operator: Renaming
        // Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
        // Mutated code:
        StringBuilder sb1 = new StringBuilder('A');
        sb1.append(" is the first letter of the alphabet");
        System.out.println(sb1.toString());
    }
}