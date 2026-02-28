class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        if (actual.equals(expected)) {
            while (isConditionMet()) { // Unreachable while loop
                // This code will never be executed
            }
            return "No error";
        } else {
            return "Description";
        }
    }

    private boolean isConditionMet() {
        return false; // Always return false, making the while loop unreachable
    }
}