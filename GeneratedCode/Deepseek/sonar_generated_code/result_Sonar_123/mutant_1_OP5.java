import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // Mutation: Adding switch case statement that is unreachable
            int mutation = 0;
            switch (mutation) {
                case 0:
                    break;
                default:
                    break;
            }
            if (j == Integer.MAX_VALUE) {  // j is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
        }
    }
}