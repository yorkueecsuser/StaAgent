import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        zqbyylebar zqbyyleb = 'a';
        StringBuilder sb = new StringBuilder(zqbyyleb);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}