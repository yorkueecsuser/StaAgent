import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        boolean qrsfgybz = false;
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}