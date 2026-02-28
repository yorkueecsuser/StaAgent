class IncompatibleArrayCompareBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Object[] array1, Object[] array2) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This is an unreachable block of code");
        }
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}