import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && false && false && true && false && false) {double qizfrseu = 962767967;}
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}