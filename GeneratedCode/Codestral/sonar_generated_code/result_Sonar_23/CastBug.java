class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable code
                int i = 0;
                i++;
            }
            return (Integer) obj;
        }
        return obj;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}