class EqualsNaNBug {
    public boolean showBug(double num) {
        double a = num;
        return a == Double.NaN; // Mutant code: Renamed variable 'num' to 'a'
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}