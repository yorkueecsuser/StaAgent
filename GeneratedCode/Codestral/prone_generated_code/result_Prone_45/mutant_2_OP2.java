class EqualsNaNBug {
    public boolean showBug(double num) {
        return num == Double.NaN; // Original code
        num = num; // Mutated code: Duplication of the assignment statement
        return num == Double.NaN; // Duplicated assignment statement
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}