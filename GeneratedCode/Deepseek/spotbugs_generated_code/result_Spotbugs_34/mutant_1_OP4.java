class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) {
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean condition = false; // Unreachable condition
        if (condition) {
            // Unreachable code block
            System.out.println("This code block is unreachable!");
        } else {
            return Add(a, b);
        }
    }
}