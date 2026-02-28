class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting unreachable while loop
        boolean conditionWhile2 = getCondition2();
        while (conditionWhile2) {
            // This loop is unreachable because conditionWhile2 is always false
        }

        return answer2;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getCondition2() {
        return false;
    }
}