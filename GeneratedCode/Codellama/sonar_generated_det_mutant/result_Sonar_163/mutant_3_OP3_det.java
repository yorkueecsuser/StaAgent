import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        if (false && true && false && true && false && true && true && false && true && false && false) {long zjvvdnqv = 387241094;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}