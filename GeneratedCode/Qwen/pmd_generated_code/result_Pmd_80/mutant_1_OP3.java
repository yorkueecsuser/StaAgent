class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block in showBug");
        }
        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block in showBug2");
        }
        return answer2;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if blocks are unreachable
        return false;
    }
}