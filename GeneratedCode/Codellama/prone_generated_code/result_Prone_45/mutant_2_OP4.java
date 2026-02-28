class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
        // inserted mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if-else branch");
        } else {
            System.out.println("This branch is reachable");
        }
    }

    // helper method
    private static boolean getCondition() {
        // insert some logic here
        return false;
    }
}