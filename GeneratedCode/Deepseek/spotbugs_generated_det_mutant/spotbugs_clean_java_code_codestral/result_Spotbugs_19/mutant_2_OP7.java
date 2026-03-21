class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        while (alwaysFalse()) {
            // This loop is unreachable
            System.out.println("This code should never execute.");
        }
        int absoluteValue = Math.abs(hashCode); // Bug: Computes absolute value of signed 32-bit hashcode
        return absoluteValue;
    }

    private boolean alwaysFalse() {
        return false;
    }
}