class CompatibleWithAnnotationMisuse {

    private boolean getCondition() {
        return false;
    }

    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            boolean unreachableCondition = getCondition(); // Always returns false
            switch (unreachableCondition) {
                case true:
                    // Unreachable code
                    break;
                default:
                    // Continue with the original code
                    return (String) obj;
            }
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}