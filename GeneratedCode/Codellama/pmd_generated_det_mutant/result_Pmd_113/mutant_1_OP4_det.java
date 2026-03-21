import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        if (true && false && true && true && true && true && true && true && true && false && false) {boolean ulhhgsxm = false;}else{boolean vsdbmykx = true;}
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}