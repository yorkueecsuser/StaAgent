class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    }
}

// Mutant 1: Renaming variable "i" to "x"
class IncrementingBug {
    public static void main(String[] args) {
        int x = 0;
        x = x++; // BUG: Values should not be uselessly incremented
        System.out.println(x); // Outputs 0
    }
}

// Mutant 2: Renaming variable "i" to "y"
class IncrementingBug {
    public static void main(String[] args) {
        int y = 0;
        y = y++; // BUG: Values should not be uselessly incremented
        System.out.println(y); // Outputs 0
    }
}