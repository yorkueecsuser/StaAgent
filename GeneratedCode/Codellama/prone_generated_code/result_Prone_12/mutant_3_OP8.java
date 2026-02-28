class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    }

    // Mutant 1: Renaming variable "x" to "a"
    int a = 100;
    int y = 32;
    int z = a << y; // BUG: BadShiftAmount
    System.out.println(z);

    // Mutant 2: Renaming variable "y" to "b"
    int x = 100;
    int b = 32;
    int z = x << b; // BUG: BadShiftAmount
    System.out.println(z);

    // Mutant 3: Renaming variable "z" to "c"
    int x = 100;
    int y = 32;
    int c = x << y; // BUG: BadShiftAmount
    System.out.println(c);
}