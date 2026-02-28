class UnicodeBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        String code = "public void vulnerable() {";
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Inserted unreachable for loop
            System.out.println("Unreachable loop");
        }

        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\"); }";
        return code;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}