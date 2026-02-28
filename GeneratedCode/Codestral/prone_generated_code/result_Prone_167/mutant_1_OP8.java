class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        String cd = code; // Mutant: Renaming
        cd += "\u202E"; // Right-to-Left Override Unicode character
        cd += " System.out.println(\"Access granted\"); }";
        return cd;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}