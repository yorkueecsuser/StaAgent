class IncompatibleArrayCompareBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Object[] array1, Object[] array2) {
        if (getUnreachableCondition()) {
            switch (array1.hashCode()) {
                // Unreachable switch cases
                case 1:
                    System.out.println("This is an unreachable case.");
                    break;
                default:
                    break;
            }
        }
        return array1.equals(array2); // Bug: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}