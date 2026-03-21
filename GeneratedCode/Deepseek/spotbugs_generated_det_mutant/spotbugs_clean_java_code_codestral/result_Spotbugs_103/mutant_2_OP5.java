class UnnecessaryTypeCheck {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        boolean shouldRun = getFalseCondition();
        if (obj instanceof String && shouldRun) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            switch (1) { // Mutant: Unreachable switch statement
                default:
                    break;
            }
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}