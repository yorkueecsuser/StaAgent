class EqualsNaNBug {
    public boolean showBug(double num) {
        double n = num;
        return n == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}