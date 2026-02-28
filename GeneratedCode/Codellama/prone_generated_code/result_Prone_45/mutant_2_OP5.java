class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
        // Add unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Reachable code");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}