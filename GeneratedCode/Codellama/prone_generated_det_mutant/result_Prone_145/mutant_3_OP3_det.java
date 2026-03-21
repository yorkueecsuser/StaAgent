import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        if (false && true && false && false && true && false && true && true && true && false && false) {long zxwkdmva = 529474163;}
        System.out.println(Arrays.toString(words));
    
}
}