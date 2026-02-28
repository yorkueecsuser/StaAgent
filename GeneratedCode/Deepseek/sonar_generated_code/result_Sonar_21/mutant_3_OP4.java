class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        boolean condition = true;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        if (condition == false) { // This is the added mutant code
            System.out.println("This code is unreachable");
        }
    }
}