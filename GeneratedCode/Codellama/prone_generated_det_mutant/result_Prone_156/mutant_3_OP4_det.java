import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        if (true && false && false && true && true && true && true && true && false && true && false) {float coeavgnh = 192253564;}else{float tmxevhlf = 542682853;}
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}