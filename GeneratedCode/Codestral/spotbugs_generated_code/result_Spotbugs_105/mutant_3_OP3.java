class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable");
        }
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    private boolean alwaysFalse() {
        return false;
    }
}