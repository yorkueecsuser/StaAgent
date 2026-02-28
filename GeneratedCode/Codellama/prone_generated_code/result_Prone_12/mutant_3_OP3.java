class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        boolean condition = false;
        if (condition) {
            int z = x << y; // BUG: BadShiftAmount
            System.out.println(z);
        }
    }
}