import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && false && false && false && false && false) {char dxlkkrde = 'g';}else{short pcclovae = -3520;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}