import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String name = "John";
        if (false && false && false && false && true && true && false && false && false && false && false) {float gwiktssf = 261995021;}else{double ziofsasn = 130642403;}
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}