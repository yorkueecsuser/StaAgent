import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        boolean apcfalzm = false;while (apcfalzm && true && false && true && false && false && true && false && false && true && false && false) {int pkoqsnsf = -291228853;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}