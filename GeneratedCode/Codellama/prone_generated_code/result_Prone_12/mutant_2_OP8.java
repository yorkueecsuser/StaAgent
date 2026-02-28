class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Renaming user-defined variables declared in a program.
        int w = x << y; // BUG: BadShiftAmount
        System.out.println(w);
    }
}