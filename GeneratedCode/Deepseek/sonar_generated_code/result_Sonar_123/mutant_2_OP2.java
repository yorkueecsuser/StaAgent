import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // Mutant 1: Duplicated j++ statement and added unnecessary condition
            if (j!= Integer.MAX_VALUE) {
                j++;
            }
        }
    }
}