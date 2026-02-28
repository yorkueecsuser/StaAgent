class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";

        // Adding an unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable statement");
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}