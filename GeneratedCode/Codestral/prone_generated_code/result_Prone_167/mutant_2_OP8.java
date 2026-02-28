class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        String buggyCode = "\u202E"; // Right-to-Left Override Unicode character
        code += buggyCode;
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}