class ConfusingMethodNames {

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING) 
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING) 
    public int calculatesum(int a, int b) {
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

    // Mutated code starts here
    public int computeTotal(int x, int y) {
        int result = x + y;
        return result;
    }

    public int computetotal(int x, int y) {
        int outcome = x * y;
        return outcome;
    }

    public String displayResult(int x, int y) {
        int total1 = computeTotal(x, y);
        int total2 = computetotal(x, y);
        return "computeTotal(" + x + ", " + y + ") = " + total1 + "\ncomputetotal(" + x + ", " + y + ") = " + total2;
    }

    public static void testMutations(String[] args) {
        ConfusingMethodNames testDemo = new ConfusingMethodNames();
        System.out.println(testDemo.displayResult(5, 6));
    }
}