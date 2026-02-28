class UnicodeBug {
    public String showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            String unreachableCode = "This code is unreachable";
            System.out.println(unreachableCode);
        }

        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    private boolean getUnreachableCondition() {
        return false; // always false to make it unreachable
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}