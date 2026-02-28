class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " while(getCondition()) { // Mutant: Unreachable while loop
            int i = 0; // This line is just to avoid an empty loop.
        }
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    public boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable.
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}