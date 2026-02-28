class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Unreachable while loop inserted as per mutation operator information
                break;
            }
            return (String) obj;
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public boolean getCondition() { // A method to dynamically determine the condition at runtime
        return false;
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}