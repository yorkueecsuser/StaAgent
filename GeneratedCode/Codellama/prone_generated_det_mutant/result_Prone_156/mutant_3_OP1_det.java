import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        boolean aelrzjbd = true;
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}