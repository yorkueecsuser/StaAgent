class ConfusingMethodNames {

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING) 
    public int calculateSum(int a, int b) {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            int temp = a - b;
        }
        return a + b;
    }

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING) 
    public int calculatesum(int a, int b) {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            int temp = a + b;
        }
        return a * b; // This method name differs only by capitalization
    }

    public String showBug(int a, int b) {
        int sum1 = calculateSum(a, b);
        int sum2 = calculatesum(a, b);
        return "calculateSum(" + a + ", " + b + ") = " + sum1 + "\ncalculatesum(" + a + ", " + b + ") = " + sum2;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        System.out.println(demo.showBug(3, 4));
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }
}