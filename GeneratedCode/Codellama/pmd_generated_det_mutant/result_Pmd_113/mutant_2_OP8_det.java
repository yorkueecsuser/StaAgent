import java.util.ArrayList;

class StringInstantiationBug {
    public static void main(String[] args) {
        String xriysfjn = "John";
        String zquszgeo = "Hello, " + xriysfjn + "!";
        System.out.println(zquszgeo);
    }
}