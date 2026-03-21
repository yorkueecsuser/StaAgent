import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        if (false && true && true && true && false && false && true && true && true && true && false) {boolean irnzjvlu = false;}
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}