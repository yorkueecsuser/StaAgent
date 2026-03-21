import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String name = "John";
        if (false && false && false && false && false && true && false && true && false && false && false) {int fsleykqu = 221061381;}else{float nusqugnk = 228714315;}
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    
}
}