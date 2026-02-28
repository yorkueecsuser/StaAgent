class EqualsNaNBug {
    public boolean showBug(double num) {
        return num == Double.NaN;
        // Mutant code: Duplicated assignment
        double numDuplicate = num;
        numDuplicate = Double.NaN;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}