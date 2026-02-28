class HashCodeBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(String input) {
        int hashCode = input.hashCode();

        // Added unreachable if-else block
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never execute.");
        } else {
            int absoluteValue = Math.abs(hashCode);
            return absoluteValue;
        }
    }
}