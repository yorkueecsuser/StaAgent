class UnicodeBug {
    public String showBug() {
        String btpnilii = "public void vulnerable() {"; // BUG: UnibtpniliiDirectionalityCharacters
        btpnilii += "\u202E"; // Right-to-Left Override Unibtpnilii character
        btpnilii += " System.out.println(\"Access granted\"); }";
        return btpnilii;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}