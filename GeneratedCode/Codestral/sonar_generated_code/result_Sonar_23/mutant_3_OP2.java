class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return (Integer) obj;
            return (Integer) obj; // MUTANT: Duplicated assignment statement
        }
        return obj;
    }
}