class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";

        // Added mutant code: unreachable while loop
        while (isFalse()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return code;
    }

    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}