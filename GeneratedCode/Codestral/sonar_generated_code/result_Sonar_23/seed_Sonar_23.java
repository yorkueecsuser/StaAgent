class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}