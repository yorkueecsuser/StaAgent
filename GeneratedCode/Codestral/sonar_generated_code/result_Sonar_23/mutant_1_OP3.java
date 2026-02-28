class CastBug {
    private boolean getUnreachableCondition() {
        return false; // Method to return a false condition
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            if (getUnreachableCondition()) { // Unreachable if statement
                System.out.println("This code will never execute");
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}