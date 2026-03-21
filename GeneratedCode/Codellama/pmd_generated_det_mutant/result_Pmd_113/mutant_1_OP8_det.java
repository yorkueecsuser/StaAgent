import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String frndnhdz = "John";
        String dgmwtkyy = "Hello, " + frndnhdz + "!";
        System.out.println(dgmwtkyy);
    }
}