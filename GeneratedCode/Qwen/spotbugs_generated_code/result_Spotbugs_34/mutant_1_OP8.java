class ConfusingMethodNames {

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
    public int calculatesum(int a, int b) {
        return a * b; // This method name differs only by capitalization
    }

    public String showBug(int a, int b) {
        int sum1 = calculateSum(a, b);
        int sum2 = calculatesum(a, b);
        String result = "calculateSum(" + a + ", " + b + ") = " + sum1 + "\ncalculatesum(" + a + ", " + b + ") = " + sum2;
        return result;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        System.out.println(demo.showBug(3, 4));
    }

    // Mutated code starts here
    public int computeTotal(int x, int y) {
        int total = x + y;
        return total;
    }

    public int computetotal(int x, int y) {
        int product = x * y;
        return product;
    }

    public String displayResult(int x, int y) {
        int res1 = computeTotal(x, y);
        int res2 = computetotal(x, y);
        String output = "computeTotal(" + x + ", " + y + ") = " + res1 + "\ncomputetotal(" + x + ", " + y + ") = " + res2;
        return output;
    }

    public static void testMutants(String[] args) {
        ConfusingMethodNames testDemo = new ConfusingMethodNames();
        System.out.println(testDemo.displayResult(5, 6));
    }
}