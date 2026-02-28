class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
        }
    }
}