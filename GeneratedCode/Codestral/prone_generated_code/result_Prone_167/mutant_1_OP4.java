class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch will never be executed
        } else {
            // Unreachable branch
            System.out.println("This branch is unreachable");
        }

        return code;
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}