class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        // Adding an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    private boolean getCondition() {
        return false; // This ensures the for loop is unreachable
    }
}