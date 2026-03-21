class UnicodeBug {
    public String showBug() {
        for  (int hdmfnhzk = 0; hdmfnhzk < 0; hdmfnhzk++) {char xykxkfnm = 't';}
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