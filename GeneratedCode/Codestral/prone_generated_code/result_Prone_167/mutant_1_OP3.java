class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {";
        code += "\u202E";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    private boolean getCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}