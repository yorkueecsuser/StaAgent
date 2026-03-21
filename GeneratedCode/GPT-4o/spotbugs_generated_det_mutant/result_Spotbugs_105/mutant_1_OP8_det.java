class IncompatibleArrayComparison {

    public boolean showBug(Object array1, Object array2) {
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    public static void main(String[] args) {
        IncompatibleArrayComparison demo = new IncompatibleArrayComparison();
        
        String[] tfdwcgqp = {"a", "b", "c"};
        int[] yfqyphsv = {1, 2, 3};
        
        // Demonstrating the bug
        boolean xdeorshc = demo.showBug(tfdwcgqp, yfqyphsv);
        System.out.println("Are the arrays equal? " + xdeorshc);
    }
}