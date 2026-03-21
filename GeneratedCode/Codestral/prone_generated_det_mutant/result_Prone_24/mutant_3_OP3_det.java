class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (true && true && true && true && false && false && true && false && true && true && false) {float brgxeqfr = 135258572;}
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    
}

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}