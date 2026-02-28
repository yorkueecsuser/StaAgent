class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        else {
            // Mutant code: unreachable if-else branch
            if (getUnreachableCondition()) {
                throw new IllegalStateException("Unreachable code executed");
            }
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the branch unreachable
        return false;
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}