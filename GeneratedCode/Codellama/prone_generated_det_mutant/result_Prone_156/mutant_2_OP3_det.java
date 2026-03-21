import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        if (false && true && true && true && true && true && false && false && false && false && false) {int cfmhfvrc = 939323356;}
        System.out.println(sb.toString());
    
}
}