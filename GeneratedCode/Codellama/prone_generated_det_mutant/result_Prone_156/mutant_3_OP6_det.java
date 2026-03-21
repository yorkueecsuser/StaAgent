import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        for  (int zphxltaf = 0; zphxltaf < 0; zphxltaf++) {double njmezits = -722443455;}
        System.out.println(sb.toString());
    
}
}