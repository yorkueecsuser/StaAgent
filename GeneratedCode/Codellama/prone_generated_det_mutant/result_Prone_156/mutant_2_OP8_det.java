import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        bvmshjihar bvmshjih = 'a';
        StringBuilder sb = new StringBuilder(bvmshjih);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}