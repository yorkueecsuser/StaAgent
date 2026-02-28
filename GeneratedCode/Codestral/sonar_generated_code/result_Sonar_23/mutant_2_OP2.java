class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj; // Original line
            return (Integer) obj; // New line: Duplicate of the original line
        }
        return obj;
    }
}