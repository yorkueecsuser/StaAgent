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

        // Adding a new loop to demonstrate Equivalent Loop Replacement
        int i = 0;
        while (i < 1) {
            System.out.println("Loop iteration: " + i);
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            System.out.println("Mutated loop iteration: " + j);
            j++;
        } while (j < 1);

        return "calculateSum(" + a + ", " + b + ") = " + sum1 + "\ncalculatesum(" + a + ", " + b + ") = " + sum2;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        System.out.println(demo.showBug(3, 4));
    }
}