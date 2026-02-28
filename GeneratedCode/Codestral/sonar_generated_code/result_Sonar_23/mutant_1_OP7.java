class CastBug {
    public Object showBug(Object obj) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code block
        }

        if (obj instanceof String) {
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private boolean getUnreachableCondition() {
        return false; // This will make the while loop unreachable
    }
}