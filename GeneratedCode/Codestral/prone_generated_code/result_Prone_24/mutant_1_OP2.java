class CompatibleWithAnnotationMisuse {

    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            return (String) obj; // original line
            return (String) obj; // duplicated line
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}