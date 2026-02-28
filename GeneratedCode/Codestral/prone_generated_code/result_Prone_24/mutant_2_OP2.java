class CompatibleWithAnnotationMisuse {

    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            String strDuplicate = str; // Mutation: Duplicating a randomly selected assignment statement
            return str;
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}