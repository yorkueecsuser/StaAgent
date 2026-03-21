import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String [] words = new String [] { "hello" , "world" };
    words = new String [] { "hello" , "world" };
    Arrays.sort(words , new Comparable());
    System.out.println(Arrays.toString(words));
}
}