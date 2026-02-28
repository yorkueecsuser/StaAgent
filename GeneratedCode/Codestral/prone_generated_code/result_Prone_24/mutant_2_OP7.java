class CompatibleWithAnnotationMisuse {

    private boolean getUnreachableCondition() {
        return false;
    }

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        while (getUnreachableCondition()) { // Unreachable while loop
            System.out.println("This loop will never execute.");
        }

        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}