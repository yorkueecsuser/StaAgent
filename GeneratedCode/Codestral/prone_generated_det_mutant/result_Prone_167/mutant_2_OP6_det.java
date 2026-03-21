class UnicodeBug {
    public String showBug() {
        for  (int inubnoqq = 0; inubnoqq < 0; inubnoqq++) {double llyhnmko = -322324604;}
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