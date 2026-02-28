class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        boolean condition = getCondition();
        while (condition) {
            // Unreachable loop
        }
        System.out.println(z);
    }
}