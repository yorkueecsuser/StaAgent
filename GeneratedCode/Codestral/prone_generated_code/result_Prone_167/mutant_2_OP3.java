class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); ";

        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because the condition is always false
            System.out.println("This is an unreachable statement");
        }

        code += "}";
        return code;
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the if statement unreachable
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}