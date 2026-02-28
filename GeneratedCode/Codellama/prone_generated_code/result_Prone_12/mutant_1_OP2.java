class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    }
}

// Mutant 1: Duplication of assignment statement
class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
        int z = x << y; // BUG: BadShiftAmount
    }
}

// Mutant 2: Duplication of assignment statement
class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    }
}