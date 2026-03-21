import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        if (true && false && false && true && true && false && true && true && false && false && false) {double immlvggs = 536352706;}else{boolean xbbwgybq = false;}
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    
}
}