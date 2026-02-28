class CastBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            if(getFalseCondition()) {
                System.out.println("This is an unreachable block due to mutation");
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}