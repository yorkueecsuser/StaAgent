class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);

        if (isUnreachable()) { // This if statement is unreachable
            int temporary = 10 / 0; // This line should never execute to avoid an ArithmeticException
        }

        return absoluteValue;
    }

    private boolean isUnreachable() {
        return false; // The condition is always false to make the if statement unreachable
    }
}