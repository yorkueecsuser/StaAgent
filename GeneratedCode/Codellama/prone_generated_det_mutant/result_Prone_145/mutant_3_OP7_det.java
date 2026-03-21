import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        boolean qzugflft = false;while (qzugflft && false && false && false && true && false && false && false && false && true && true && false) {float ausylzdu = -593481842;}
        System.out.println(Arrays.toString(words));
    
}
}