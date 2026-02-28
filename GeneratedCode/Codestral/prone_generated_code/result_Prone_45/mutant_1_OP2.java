class EqualsNaNBug {
    public boolean showBug(double num) {
        return num == Double.NaN;
        return num == Double.NaN; // Mutant: Duplicated the return statement
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}