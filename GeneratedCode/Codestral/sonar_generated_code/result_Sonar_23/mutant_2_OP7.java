class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code will never be executed
                System.out.println("This is an unreachable loop");
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }
}