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
        int pjsdayue = calculateSum(a, b);
        int knsehfes = calculatesum(a, b);
        return "calculateSum(" + a + ", " + b + ") = " + pjsdayue + "\ncalculatesum(" + a + ", " + b + ") = " + knsehfes;
    }

    public static void main(String[] args) {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        System.out.println(demo.showBug(3, 4));
    }
}