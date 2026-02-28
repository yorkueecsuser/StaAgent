class AbsBug {
    public int showBug(String str) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
        }
        return Math.abs(str.hashCode());
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}