class UnicodeBug {
    public String showBug() {
        for  (int vlhhhjrr = 0; vlhhhjrr < 0; vlhhhjrr++) {double tppwysfk = -47797183;}
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";
        return code;
    
}

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}