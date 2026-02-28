import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // Mutation: Duplication
            j++; // Duplicated statement
            if (j == Integer.MAX_VALUE) {  
                break;
            }
        }
    }
}