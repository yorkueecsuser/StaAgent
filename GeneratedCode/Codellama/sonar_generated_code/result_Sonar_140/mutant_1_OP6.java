class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0

        // Unreachable for loop added for mutation
        for (int j = 0; false; j++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}