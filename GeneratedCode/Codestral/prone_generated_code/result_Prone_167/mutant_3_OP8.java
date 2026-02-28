class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";
        String changedCode = code; // Mutated code: Renamed the variable "code" to "changedCode"
        return changedCode;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}