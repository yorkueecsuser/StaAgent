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
        String result = "calculateSum(" + a + ", " + b + ") = " + sum1 + "\ncalculatesum(" + a + ", " + b + ") = " + sum2;
        return result;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        System.out.println(demo.showBug(3, 4));
    }

    // Mutated code with renaming of variable 'a' to 'x' and 'b' to 'y'
    public String displayIssue(int x, int y) {
        int total1 = calculateSum(x, y);
        int total2 = calculatesum(x, y);
        String output = "calculateSum(" + x + ", " + y + ") = " + total1 + "\ncalculatesum(" + x + ", " + y + ") = " + total2;
        return output;
    }
}