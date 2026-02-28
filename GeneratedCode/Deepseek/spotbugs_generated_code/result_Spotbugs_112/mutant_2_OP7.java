class FieldMaskingBug {
    private String message;
    private boolean getCondition() { return false; }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        while (getCondition()) { // Mutant code: Unreachable while loop
            System.out.println("This line is unreachable");
        }
        return localMessage;
    }
}