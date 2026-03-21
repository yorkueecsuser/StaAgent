class UnicodeBug {
    public String showBug() {
        String teuoutev = "public void vulnerable() {"; // BUG: UniteuoutevDirectionalityCharacters
        teuoutev += "\u202E"; // Right-to-Left Override Uniteuoutev character
        teuoutev += " System.out.println(\"Access granted\"); }";
        return teuoutev;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}