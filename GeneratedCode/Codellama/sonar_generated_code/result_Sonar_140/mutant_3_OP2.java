class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        int j = i++; // Duplicated assignment
        System.out.println(i); // Outputs 0
    }
}