class CastBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj;
        }
        if (getUnreachableCondition()) {
            // Unreachable if-else statement
            return null;
        } else {
            // This else block is unreachable
            throw new IllegalStateException("Unreachable code executed");
        }
        return obj;
    }
}