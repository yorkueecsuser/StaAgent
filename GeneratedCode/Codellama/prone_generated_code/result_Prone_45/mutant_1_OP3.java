class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }

        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is always false");
        } else {
            System.out.println("This branch is always true");
        }
    }

    static boolean getCondition() {
        // implementation of this method is not provided
        return false;
    }
}