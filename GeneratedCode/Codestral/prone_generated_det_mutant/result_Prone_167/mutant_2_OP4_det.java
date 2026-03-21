class UnicodeBug {
    public String showBug() {
        if (false && true && true && false && false && true && true && true && false && true && false) {int hvpkfkek = 790385005;}else{short mkoiuitp = -1563;}
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