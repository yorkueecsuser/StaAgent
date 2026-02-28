class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    // New mutated code, which creates an unreachable for loop
    public void unreachableForLoop() {
        boolean condition = false; // This condition is always false, making the for loop unreachable
        for (int i = 0; condition; i++) {
            System.out.println("This line of code is unreachable and won't be executed.");
        }
    }
}