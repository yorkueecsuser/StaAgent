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
        return "calculateSum(" + a + ", " + b + ") = " + sum1 + "\ncalculatesum(" + a + ", " + b + ") = " + sum2;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        
        // Equivalent Loop Replacement (though there are no loops, adding a dummy loop for demonstration)
        int i = 0;
        do {
            System.out.println(demo.showBug(3, 4));
            i++;
        } while (i < 1); // This is an equivalent replacement of a non-existent loop

        System.out.println(demo.showBug(3, 4));
    }
}