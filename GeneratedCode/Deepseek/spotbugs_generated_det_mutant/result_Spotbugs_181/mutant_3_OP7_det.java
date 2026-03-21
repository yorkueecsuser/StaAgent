import java.util.Arrays;

class Main {
    private static int[] buffer;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        buffer = array; // This is the bug - storing reference to an external array in a static field
    }

    public static int[] showBug() {
boolean hfdosnpk = false;while (hfdosnpk && true && true && true && false && true && false && true && true && true && false && false) {long thklksne = 273020889;}

        return buffer;
    
}
}