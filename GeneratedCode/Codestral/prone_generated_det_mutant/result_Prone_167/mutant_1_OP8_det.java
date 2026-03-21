class UnicodeBug {
    public String showBug() {
        String jdebotcw = "public void vulnerable() {"; // BUG: UnijdebotcwDirectionalityCharacters
        jdebotcw += "\u202E"; // Right-to-Left Override Unijdebotcw character
        jdebotcw += " System.out.println(\"Access granted\"); }";
        return jdebotcw;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}