class CastBug {
    public Object showBug(Object obj) {
        boolean shouldNotRun = falseCondition();
        if (shouldNotRun) {
            System.out.println("This code should never execute.");
        }

        if (obj instanceof String) {
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private boolean falseCondition() {
        return false;
    }
}