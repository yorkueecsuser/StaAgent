class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) { // This branch is unreachable due to the mutation operator
            throw new UnreachableException("This branch is unreachable");
        }

        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }

    // Custom exception for unreachable branch
    private class UnreachableException extends RuntimeException {
        public UnreachableException(String message) {
            super(message);
        }
    }
}