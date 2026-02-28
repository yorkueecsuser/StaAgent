class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            boolean unreachableCondition = false;
            for (int i = 0; unreachableCondition; i++) {
                // This loop is unreachable
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}