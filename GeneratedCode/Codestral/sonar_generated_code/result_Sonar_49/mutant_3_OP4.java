class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        if (actual.equals(expected)) {
            return "No error";
        } else {
            boolean unreachableCondition = false; // Always false to make the branch unreachable
            if (unreachableCondition) {
                // Unreachable code
                System.out.println("This code is unreachable");
                return "Unreachable error";
            }
            return "Description";
        }
    }
}