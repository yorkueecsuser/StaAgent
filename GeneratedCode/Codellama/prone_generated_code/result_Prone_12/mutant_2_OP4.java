class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Inserted unreachable if-else branch
        if (false) {
            int a = 1;
            int b = 2;
            int c = a + b;
            System.out.println(c);
        } else {
            int d = 3;
            int e = 4;
            int f = d + e;
            System.out.println(f);
        }
    }
}