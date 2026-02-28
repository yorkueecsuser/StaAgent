class EqualsNaNBug {
    public boolean showBug(double num) {
        if (isFalse()) { // Added dynamically unreachable if statement
            System.out.println("Unreachable code");
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private boolean isFalse() { // Method that always returns false
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}