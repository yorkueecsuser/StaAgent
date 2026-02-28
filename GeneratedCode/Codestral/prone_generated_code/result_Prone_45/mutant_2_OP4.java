class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean unreachableCondition = falseMethod(); // added dynamically determined condition
        if (unreachableCondition) { // unreachable if-else branch
            return true;
        } else {
            return num == Double.NaN;
        }
    }

    private boolean falseMethod() { // method that always returns false for dynamic condition
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}