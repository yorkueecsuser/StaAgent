import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String name = "John";
        if (false && true && false && true && true && true && false && false && false && false && false) {String jvaghwuu = "mcfvpvll";}
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}