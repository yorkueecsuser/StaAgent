import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String name = "John";
        if (false && true && false && false && true && true && false && true && true && false && false) {boolean nhuuqzcf = true;}
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}