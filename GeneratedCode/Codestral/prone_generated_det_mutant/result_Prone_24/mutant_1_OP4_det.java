class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (false && false && false && true && false && true && true && true && false && true && false) {long fxbcatcl = -308088568;}else{byte pjhzedvt = 7;}
        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    
}

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}