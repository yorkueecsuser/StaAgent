import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        if (false && false && false && false && true && true && true && false && true && false && false) {char wwbdluuw = 'w';}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}