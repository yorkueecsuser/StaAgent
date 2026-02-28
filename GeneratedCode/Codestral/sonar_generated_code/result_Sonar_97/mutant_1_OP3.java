class AbsBug {
    public int showBug(String str) {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
        return Math.abs(str.hashCode());
    }

    private boolean getCondition() {
        // This method always returns false
        return false;
    }
}