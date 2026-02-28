class Main {
    private static boolean condition = false;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            for(int i = 0; condition && i < 100; i++) {
                System.out.println("Unreachable loop inserted by mutation");
            }
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }
}