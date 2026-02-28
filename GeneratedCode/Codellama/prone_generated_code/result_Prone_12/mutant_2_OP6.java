class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Add unreachable code here
        }
    }
}