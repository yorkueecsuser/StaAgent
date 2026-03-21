import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] vvxbopwo = new String[]{"hello", "world"};
        Arrays.sort(vvxbopwo, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(vvxbopwo));
    }
}