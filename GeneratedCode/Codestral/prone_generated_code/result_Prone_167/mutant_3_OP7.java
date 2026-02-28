class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {";
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            int i = 0;
            i++;
        }
        code += "\u202E";
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}