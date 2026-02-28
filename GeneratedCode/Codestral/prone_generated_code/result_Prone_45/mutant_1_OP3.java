class EqualsNaNBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(double num) {
        if (getCondition()) {
            System.out.println("Unreachable code executed!");
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}