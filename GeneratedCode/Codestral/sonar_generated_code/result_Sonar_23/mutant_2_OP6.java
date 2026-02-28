class CastBug {
    public Object showBug(Object obj) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
            // Condition is always false, so this loop will never execute
        }
        if (obj instanceof String) {
            return (Integer) obj;
        }
        return obj;
    }

    private boolean getCondition() {
        return false;
    }
}