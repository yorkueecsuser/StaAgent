class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code");
        }
        return Add(a, b);
    }
}