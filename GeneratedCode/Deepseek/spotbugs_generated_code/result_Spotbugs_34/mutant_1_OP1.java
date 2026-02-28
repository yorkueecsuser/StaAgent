class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) {
        return a - b;
    }

    public int showBug(int a, int b) {
        int unusedVariable = 0; // Dead store
        return Add(a, b);
    }
}