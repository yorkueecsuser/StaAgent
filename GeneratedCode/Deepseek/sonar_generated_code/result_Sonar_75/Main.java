class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
            z = 1;
        }
        z = 1 / z; // BUG: Zero should not be a possible denominator
        return z;
    }

    private static boolean unknown() {
        return true; // For the purpose of this example, we return true for the bug to occur
    }
}