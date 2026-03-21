class CompatibleWithExample {

    /**
     * A custom annotation to demonstrate the misuse of @CompatibleWith.
     */
    public @interface CompatibleWith {
        String value();
    }

    /**
     * A method demonstrating the misuse of the @CompatibleWith annotation.
     * The type argument provided does not match any actual type argument of the generic class.
     */
    public boolean isCompatible(@CompatibleWith("String") Object obj) { // BUG: CompatibleWithAnnotationMisuse
        return obj instanceof String;
    }

    /**
     * Method to show the bug.
     *
     * @param obj The object to be checked.
     * @return The result of the isCompatible method.
     */
    public boolean showBug(Object obj) {
        return isCompatible(obj);
    }
public static void main(String [] args){
    CompatibleWithExample example = new CompatibleWithExample();
    example = new CompatibleWithExample();
    System.out.println(example.showBug("Test String"));
    System.out.println(example.showBug(123));
}
}