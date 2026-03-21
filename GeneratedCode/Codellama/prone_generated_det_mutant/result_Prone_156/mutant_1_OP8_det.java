import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        htzaugxgar htzaugxg = 'a';
        StringBuilder sb = new StringBuilder(htzaugxg);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}