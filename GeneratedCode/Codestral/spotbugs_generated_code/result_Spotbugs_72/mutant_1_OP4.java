class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never execute");
        } else {
            return obj == str; // Original bug remains
        }
    }

    // Dummy method for runtime condition
    private boolean getCondition() {
        return false;
    }
}