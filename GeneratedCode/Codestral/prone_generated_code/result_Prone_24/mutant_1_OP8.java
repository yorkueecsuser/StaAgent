class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object ob) { // Renamed obj to ob
        if (ob instanceof String) {
            return (String) ob; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}