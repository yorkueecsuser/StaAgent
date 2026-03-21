class UnicodeBug {
    public String showBug() {
        int spzvhzyw = 0;switch  (spzvhzyw) {case 1:byte rfcrryaa = 4;break;default:long hprxgirz = 395485159;break;}
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