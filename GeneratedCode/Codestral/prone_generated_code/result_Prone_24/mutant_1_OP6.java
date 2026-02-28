class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Mutation: Unreachable for loop
            // Added unreachable for loop as per mutation operator
        }
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}