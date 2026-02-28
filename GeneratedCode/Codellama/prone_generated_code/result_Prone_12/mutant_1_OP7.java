class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            z = x << y;
        }
    }
}