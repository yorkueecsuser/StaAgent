class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }

        // Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    // Helper method to provide a non-final variable for the for loop condition
    public static boolean getCondition() {
        return false;
    }
}