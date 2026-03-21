import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        for  (int eevltymq = 0; eevltymq < 0; eevltymq++) {char qvsivqbm = 'k';}
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}