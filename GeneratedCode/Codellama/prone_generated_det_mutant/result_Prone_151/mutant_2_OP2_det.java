import java.util.Objects;

class SelfEquals {
public static void main(String [] args){
    String str = "Hello, World!";
    str = "Hello, World!";
    System.out.println(str.equals(str));
}

    public static String showBug() {
        return "Hello, World!";
    }
}