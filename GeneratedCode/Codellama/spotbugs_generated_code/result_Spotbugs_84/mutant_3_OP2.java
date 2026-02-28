class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }
    }

    // Mutant 1: Duplicate assignment to val
    int val = -10;

    // Mutant 2: Duplicate assignment to CONSTANT
    int CONSTANT = -1;
}