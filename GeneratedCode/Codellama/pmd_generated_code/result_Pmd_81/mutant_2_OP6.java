class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);

        // Mutation Operator: Unreachable for loop
        // Insert unreachable for loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        for (int i = 0; false; i++) {
            // This loop will never be executed
            System.out.println("This will never be printed");
        }
    }
}