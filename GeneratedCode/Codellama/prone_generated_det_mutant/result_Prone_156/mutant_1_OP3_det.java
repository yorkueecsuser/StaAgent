import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        if (false && false && true && false && false && true && false && false && false && true && false) {float xpqujrfr = -878366236;}
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}