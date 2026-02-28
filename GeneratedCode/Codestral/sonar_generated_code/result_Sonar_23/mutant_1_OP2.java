class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj;
            // Added mutation:
            return (Integer) obj;
        }
        return obj;
    }
}