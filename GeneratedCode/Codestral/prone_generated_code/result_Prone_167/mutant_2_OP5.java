class UnicodeBug {
    public String showBug() {
        String code = "public void vulnerable() {";
        code += "\u202E"; // Right-to-Left Override Unicode character
        code += " System.out.println(\"Access granted\");";

        // Adding unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        code += " }";
        return code;
    }

    // Method to return false constant value
    private boolean getCondition() {
        return false;
    }

    // Method to return a value that will never be 1
    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        UnicodeBug bug = new UnicodeBug();
        System.out.println(bug.showBug());
    }
}