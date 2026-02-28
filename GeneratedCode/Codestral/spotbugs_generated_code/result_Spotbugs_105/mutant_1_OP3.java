class IncompatibleArrayCompareBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Object[] array1, Object[] array2) {
        // Inserted unreachable if statement
        if (getCondition()) {
            System.out.println("This if statement should not be executed.");
        }

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}