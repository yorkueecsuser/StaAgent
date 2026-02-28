class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {  // Unreachable for loop
            System.out.println("This line will never be executed.");
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