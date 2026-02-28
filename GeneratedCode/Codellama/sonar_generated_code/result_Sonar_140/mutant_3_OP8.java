class IncrementingBug {
    public static void main(String[] args) {
        int j = 0;
        j = j++; // BUG: Values should not be uselessly incremented
        System.out.println(j); // Outputs 0
    }
}