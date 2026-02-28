class UnicodeBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        String code = "public void vulnerable() {"; // BUG: UnicodeDirectionalityCharacters
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";

        if (getUnreachableCondition()) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This line is unreachable");
                    break;
            }
        }

        return code;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}