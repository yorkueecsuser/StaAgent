import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A');
        if (false) {
            sb.append(" is the first letter of the alphabet");
        } else {
            sb.append(" is not the first letter of the alphabet");
        }
        System.out.println(sb.toString());
    }
}