class CastBug {
    public Object showBug(Object obj) {
        boolean unreachableCondition = falseMethod(); // Unreachable condition
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code.");
        }
        if (obj instanceof String) {
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private boolean falseMethod() {
        return false;
    }
}