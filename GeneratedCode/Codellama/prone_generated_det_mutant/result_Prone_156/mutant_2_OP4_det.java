import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        if (false && true && false && true && false && false && false && true && true && false && false) {int scxjpprm = 418004749;}else{char kkphmriv = 'j';}
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}