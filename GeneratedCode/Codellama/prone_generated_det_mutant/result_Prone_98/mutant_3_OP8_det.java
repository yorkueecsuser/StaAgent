import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] jvctkzkw = {"Alice", "Bob", "Charlie"};
        String fmnwfofw = String.format("Hello, %s", jvctkzkw[0], jvctkzkw[1], jvctkzkw[2]);
        System.out.println(fmnwfofw);
    }
}