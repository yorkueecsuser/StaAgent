class CastBug {
    public Object showBug(Object obj) {
        Object a = obj;
        if (a instanceof String) {
            return (Integer) a; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }
}