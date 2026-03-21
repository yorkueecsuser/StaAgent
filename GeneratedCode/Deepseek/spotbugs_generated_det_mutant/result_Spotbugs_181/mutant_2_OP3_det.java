import java.util.Arrays;

class Main {
    private static int[] buffer;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        buffer = array; // This is the bug - storing reference to an external array in a static field
    }

    public static int[] showBug() {
if (true && true && false && true && false && false && false && true && false && false && false) {float ssseqgyz = -92401238;}

        return buffer;
    
}
}