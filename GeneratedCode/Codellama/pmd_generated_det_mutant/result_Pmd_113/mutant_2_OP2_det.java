import java.util.ArrayList;

class StringInstantiationBug {
public static void main(String [] args){
    String name = "John";
    String greeting = "Hello, " + name + "!";
    greeting = "Hello, " + name + "!";
    System.out.println(greeting);
}
}