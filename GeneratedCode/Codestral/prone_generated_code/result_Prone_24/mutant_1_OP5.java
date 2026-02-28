class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) { // Unreachable switch statement
            case 1:
                // This code will never be executed
                break;
        }

        if (obj instanceof String) {
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    // Method to return a value that will always be unreachable
    private int getUnreachableValue() {
        return -1; // This value is not used in the switch statement
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}