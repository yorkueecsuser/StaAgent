import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        for  (int otfujnor = 0; otfujnor < 0; otfujnor++) {char oducrjqq = 's';}
        System.out.println(sb.toString());
    
}
}