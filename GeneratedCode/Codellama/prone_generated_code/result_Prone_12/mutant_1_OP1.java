class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        String w = "deadstore"; // Dead Store
        System.out.println(z);
    }
}