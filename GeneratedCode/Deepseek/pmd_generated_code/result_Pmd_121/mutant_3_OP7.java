class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }

    // Mutated code
    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) { // This will always be true, making the loop unreachable
            // Empty code to avoid unreachable statement error
        }
    }

    // Method to get a condition for the mutated code
    private boolean getCondition() {
        return true;
    }
}