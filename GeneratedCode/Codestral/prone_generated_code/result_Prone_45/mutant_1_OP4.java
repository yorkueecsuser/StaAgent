class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean shouldRun = false;
        if (shouldRun) { // Unreachable branch
            int x = 10;
            int y = 20;
            int z = x + y;
            System.out.println("Unreachable code: " + z);
        }
        return num == Double.NaN; // Original code
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}