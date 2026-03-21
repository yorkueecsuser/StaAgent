import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        short avezodjx = 4469;
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}