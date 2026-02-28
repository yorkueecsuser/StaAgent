class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {";
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";

        // MUTANT CODE: Duplication of the assignment statement
        String duplicatedCode = code;

        return code;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}