class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            if (x == Double.NaN) {
                System.out.println("x is NaN");
            } else {
                System.out.println("x is not NaN");
            }
        }
    }
}