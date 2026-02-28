class EqualsNaNBug {
    private boolean getCondition() {
        return false; // this method will always return false
    }

    public boolean showBug(double num) {
        while (getCondition()) { // unreachable while loop
            System.out.println("This line will never be executed.");
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}