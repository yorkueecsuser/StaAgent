class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        boolean conditionWhile = false;
        while (conditionWhile) { // Mutation: Unreachable while loop
            System.out.println("Unreachable code");
        }
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    private boolean getCondition() {
        return false;
    }
}