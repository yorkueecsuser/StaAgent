class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop
            System.out.println("This loop will never be executed");
        }

        // Original code
        return actual.equals(expected)? "No error" : "Description";
    }

    private boolean getUnreachableCondition() {
        // The condition is always false to make the loop unreachable
        return false;
    }
}