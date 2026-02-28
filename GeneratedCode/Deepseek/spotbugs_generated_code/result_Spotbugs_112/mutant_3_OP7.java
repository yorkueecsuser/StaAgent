class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // MUTATION: Unreachable while loop
        boolean conditionWhile = false; // The condition is always false to make the loop unreachable
        while (conditionWhile) {
            System.out.println("This code will not be executed");
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}