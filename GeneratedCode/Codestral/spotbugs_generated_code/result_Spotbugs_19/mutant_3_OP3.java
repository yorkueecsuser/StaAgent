class HashCodeBug {
    private boolean getFalseCondition() {
        // This method returns false to make the if statement unreachable.
        return false;
    }

    public int showBug(String input) {
        if (getFalseCondition()) {
            // This if statement is unreachable
            System.out.println("This line of code will never execute.");
        }

        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    }
}