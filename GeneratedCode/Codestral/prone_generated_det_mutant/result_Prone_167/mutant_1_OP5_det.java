class UnicodeBug {
    public String showBug() {
        int vcyvtodt = 0;switch  (vcyvtodt) {case 1:byte jnjesopc = -15;break;default:boolean sxhiutlm = true;break;}
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