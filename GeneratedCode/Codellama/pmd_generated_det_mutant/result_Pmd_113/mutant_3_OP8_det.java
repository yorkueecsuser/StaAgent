import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String gozmocii = "John";
        String bpgjkylt = "Hello, " + gozmocii + "!";
        System.out.println(bpgjkylt);
    }
}