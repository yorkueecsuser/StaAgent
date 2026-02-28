class IncompatibleArrayCompareBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Object[] array1, Object[] array2) {
        int unreachableValue = getFalseCondition()? 1 : 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should be unreachable.");
                break;
            default:
                break;
        }
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}