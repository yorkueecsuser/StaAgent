import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] kkoptiln = new String[]{"hello", "world"};
        Arrays.sort(kkoptiln, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(kkoptiln));
    }
}