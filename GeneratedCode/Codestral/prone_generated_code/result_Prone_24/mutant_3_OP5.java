class CompatibleWithAnnotationMisuse {

    // Bug: CompatibleWithAnnotationMisuse
    public String convertToImmutable(Object obj) {
        if (obj instanceof String) {
            int value = getUnreachableValue();
            switch (value) {
                case 1:
                    System.out.println("This is an unreachable switch case.");
                    break;
                default:
                    // This will never execute.
                    break;
            }
            return (String) obj; // This will always be safe due to @Immutable annotation (but @Immutable annotation is not defined)
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1, making the switch case unreachable.
        return 0;
    }
}