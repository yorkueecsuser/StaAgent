import java.util.Arrays;

class Main {
    private static int[] buffer;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        buffer = array; // This is the bug - storing reference to an external array in a static field
    }

    public static int[] showBug() {
boolean yawfptvb = false;while (yawfptvb && true && true && true && false && false && false && false && false && true && false && false) {int ucrumzsd = 248018074;}

        return buffer;
    
}
}