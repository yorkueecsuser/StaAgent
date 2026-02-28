class BrokenNullCheck {
    public String showBug(String string) {
        boolean isEmptyString = string.equals(""); // Mutation 1: Add a check for an empty string
        boolean isNull = string == null; // Mutation 2: Add a check if the string is null

        // BUG: BrokenNullCheck
        if (!isNull &&!isEmptyString) {
            return string;
        } else {
            return null; // Mutation 3: Add an unreachable else branch
        }
    }
}