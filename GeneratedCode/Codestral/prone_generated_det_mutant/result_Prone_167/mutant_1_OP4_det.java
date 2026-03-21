class UnicodeBug {
    public String showBug() {
        if (true && true && false && true && false && false && false && true && true && true && false) {float tsthplwk = 586290687;}else{char fmnsjewc = 'b';}
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