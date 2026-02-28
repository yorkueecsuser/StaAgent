class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    }
}

// Renaming mutant
class BadShiftAmount {
    public static void main(String[] args) {
        int a = 100;
        int b = 32;
        int c = a << b; // BUG: BadShiftAmount
        System.out.println(c);
    }
}