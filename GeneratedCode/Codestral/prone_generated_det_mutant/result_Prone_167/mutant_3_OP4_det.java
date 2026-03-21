class UnicodeBug {
    public String showBug() {
        if (true && false && false && false && false && false && true && true && false && false && false) {float aylgldiw = -332238663;}else{String dkfiqajl = "svacznnf";}
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