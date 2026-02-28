class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        // Unreachable if-else branch added here
        boolean shouldRun = false;
        if (shouldRun) {
            throw new RuntimeException("Unreachable code executed");
        } else {
            if (obj instanceof String) {
                return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
            }
            throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
        }
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}