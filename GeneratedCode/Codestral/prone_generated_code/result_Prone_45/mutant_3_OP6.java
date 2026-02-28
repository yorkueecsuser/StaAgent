class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean unreachableLoopCondition = getUnreachableLoopCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            // This loop is unreachable
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private boolean getUnreachableLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}