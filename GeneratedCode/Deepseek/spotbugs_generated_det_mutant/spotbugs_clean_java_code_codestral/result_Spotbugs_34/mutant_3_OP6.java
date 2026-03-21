class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Mutant: Unreachable for loop
            System.out.println("Unreachable code block");
        }
        return Add(a, b);
    }
}