class CastBug {
    public Object showBug(Object obj) {
        // Mutant: Rename variable 'obj' to 'o'
        Object o = obj;
        if (o instanceof String) {
            return (Integer) o; // BUG: Cast operations should not trigger a ClassCastException
        }
        return o;
    }
}