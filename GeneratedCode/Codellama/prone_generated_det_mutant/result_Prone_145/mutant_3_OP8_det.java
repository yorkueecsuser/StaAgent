import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] unqrorka = new String[]{"hello", "world"};
        Arrays.sort(unqrorka, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(unqrorka));
    }
}