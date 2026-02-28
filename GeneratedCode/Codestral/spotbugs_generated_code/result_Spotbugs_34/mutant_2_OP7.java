class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable because the condition is false
            int temp = a + b;
            a = temp - a;
            b = temp - b;
        }
        return Add(a, b);
    }
}