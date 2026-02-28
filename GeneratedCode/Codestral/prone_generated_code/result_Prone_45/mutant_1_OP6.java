class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean unreachableCondition = getUnreachableCondition(); // added this line
        for (int i = 0; unreachableCondition; i++) { // inserted unreachable for loop
            System.out.println("Unreachable code block");
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private boolean getUnreachableCondition() {
        return false; // always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}