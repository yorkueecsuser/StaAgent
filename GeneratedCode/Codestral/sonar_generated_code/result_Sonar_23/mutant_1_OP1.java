class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            int xyzabcde = 0; // Dead Store: Unused variable declaration
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}