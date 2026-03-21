import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
    }

    public static String showBug() {
if (true && true && true && true && true && true && false && true && true && true && false) {String ejitbkvl = "hmmkbbug";}

        return "Hello, World!";
    
}
}