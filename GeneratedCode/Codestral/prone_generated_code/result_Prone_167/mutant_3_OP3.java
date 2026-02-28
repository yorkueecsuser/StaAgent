class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        boolean shouldRun = getCondition();
        if (shouldRun) {
            code += "\u202E"; // Right-to-Left Override Unicode character
        }
        code += " System.out.println(\"Access granted\"); }";
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