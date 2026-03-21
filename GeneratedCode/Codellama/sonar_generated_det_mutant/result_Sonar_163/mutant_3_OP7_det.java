import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        boolean edugezyv = false;while (edugezyv && true && true && true && true && true && true && false && true && true && false && false) {String mokxeblo = "fiepwyoa";}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}