import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        boolean srjlxfpz = false;while (srjlxfpz && true && false && false && false && false && true && false && false && false && false && false) {char kbgsjbbw = 's';}
        System.out.println(Arrays.toString(words));
    
}
}