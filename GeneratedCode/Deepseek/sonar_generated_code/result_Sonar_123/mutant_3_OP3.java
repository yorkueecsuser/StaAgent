import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        boolean flag = true; // Adding a non-final variable 'flag'
        while (flag) { // Using 'flag' as the loop condition
            j++;
            // BUG: Loops should not be infinite
            if (j == Integer.MAX_VALUE) {  // j is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
            flag = false; // Making 'flag' false to make the loop unreachable
        }
    }
}