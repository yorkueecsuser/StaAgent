class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable if-else branch
            throw new RuntimeException("Unreachable code executed");
        } else {
            // This else branch is also unreachable, but it's added to maintain the if-else structure
            System.out.println("This line should never be executed");
        }
        return obj;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if-else branch unreachable
    }
}