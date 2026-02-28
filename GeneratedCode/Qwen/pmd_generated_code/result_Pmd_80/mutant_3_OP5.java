class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is another unreachable case");
                break;
        }

        return answer2;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always false
        return false;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}