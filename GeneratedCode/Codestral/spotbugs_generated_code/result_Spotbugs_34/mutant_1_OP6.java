class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        for (int i = 0; getUnreachableCondition(); i++) { // Mutation: Unreachable for loop
            System.out.println("This line will never be executed.");
        }
        return Add(a, b);
    }

    private boolean getUnreachableCondition() { // This method always returns false
        return false;
    }
}