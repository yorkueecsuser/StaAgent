class IncompatibleArrayComparison {

    public boolean showBug(Object array1, Object array2) {
char xmnwyeex = 'o';

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}

    public static void main(String[] args) {
        IncompatibleArrayComparison demo = new IncompatibleArrayComparison();
        
        String[] stringArray = {"a", "b", "c"};
        int[] intArray = {1, 2, 3};
        
        // Demonstrating the bug
        boolean result = demo.showBug(stringArray, intArray);
        System.out.println("Are the arrays equal? " + result);
    }
}