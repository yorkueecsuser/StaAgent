class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Added unreachable for loop
        for (int i = 0; false; i++) {
            // Do nothing
        }
    }
}