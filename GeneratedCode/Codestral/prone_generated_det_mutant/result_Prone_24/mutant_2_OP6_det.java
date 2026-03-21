class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        for  (int ydyjtmjz = 0; ydyjtmjz < 0; ydyjtmjz++) {double fsyqarwu = -743069319;}
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    
}

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}