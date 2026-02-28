class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        if (value > max) { // Unreachable if-else statement
            value = max;
        } else {
            if (value < min) { // Unreachable if-else statement
                value = min;
            }
        }
        int result = value;
        return result;
    }
}