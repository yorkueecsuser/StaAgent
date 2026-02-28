class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        } else {
            // Alternative code
            System.out.println("Alternative code executed.");
        }

        return code;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}