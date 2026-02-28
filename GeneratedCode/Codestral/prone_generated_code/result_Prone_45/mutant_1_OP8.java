class EqualsNaNBug {
    public boolean showBug(double num) {
        double x = num;
        return x == Double.NaN;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}