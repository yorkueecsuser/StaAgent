import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && true && false && true && false && false) {char agwzohak = 'z';}
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}