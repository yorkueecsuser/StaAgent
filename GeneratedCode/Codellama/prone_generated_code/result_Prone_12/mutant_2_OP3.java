class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Mutant 1: Unreachable if statement
        if (false) {
            // code that is always unreachable
            z = x << y;
        }
    }
}