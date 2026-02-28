class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Original bug
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));

        // Mutant code: unreachable for loop
        boolean conditionFor = false; // condition is always false to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            // This block of code is unreachable
            System.out.println("This is an unreachable for loop");
        }
    }
}