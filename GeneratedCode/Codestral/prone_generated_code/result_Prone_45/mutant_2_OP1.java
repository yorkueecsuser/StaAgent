class EqualsNaNBug {
    public boolean showBug(double num) {
        int deadStoreVariable; // Added Dead Store variable
        return num == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}