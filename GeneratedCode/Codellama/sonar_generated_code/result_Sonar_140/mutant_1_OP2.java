class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        i = i++; // Mutant code: Duplicating the assignment statement
        System.out.println(i); // Outputs 0
    }
}