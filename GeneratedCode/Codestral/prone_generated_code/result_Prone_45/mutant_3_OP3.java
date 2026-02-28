class EqualsNaNBug {
    public boolean showBug(double num) {
        // Original code
        if (num == Double.NaN) {
            return true;
        }

        // Inserted unreachable if statement
        if (getUnreachableCondition()) {
            // This code will never be executed, as getUnreachableCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }

        return false;
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}