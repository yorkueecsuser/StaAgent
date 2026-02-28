class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            Object o = obj; // Renamed variable obj to o
            return (String) o; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}