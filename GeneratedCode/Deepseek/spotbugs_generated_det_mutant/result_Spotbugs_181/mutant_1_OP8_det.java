import java.util.Arrays;

class Main {
    private static int[] buffer;

    public static void main(String[] args) {
        int[] fhwanzop = {1, 2, 3, 4, 5};
        buffer = fhwanzop; // This is the bug - storing reference to an external fhwanzop in a static field
    }

    public static int[] showBug() {
        return buffer;
    }
}