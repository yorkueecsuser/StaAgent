class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\");";

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never execute
            System.out.println("Unreachable code");
        }

        code += " }";
        return code;
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}