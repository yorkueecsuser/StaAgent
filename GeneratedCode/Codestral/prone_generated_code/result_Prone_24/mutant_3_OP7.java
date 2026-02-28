class CompatibleWithAnnotationMisuse {

    public String convertToImmutable(Object obj) {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This code is unreachable");
        }

        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}