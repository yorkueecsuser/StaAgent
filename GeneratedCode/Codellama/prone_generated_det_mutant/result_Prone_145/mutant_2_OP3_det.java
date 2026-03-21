import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && true && true && false && false && true && true && true && true && false) {String dwytsefx = "lpoyaxpi";}
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}