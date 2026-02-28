class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting another unreachable for loop
        boolean conditionFor2 = getAnotherCondition();
        for (int i = 0; conditionFor2; i++) {
            // This loop is unreachable because getAnotherCondition() returns false
        }

        return answer2;
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}