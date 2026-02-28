class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned

        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug

        // Introduced unreachable for loop
        boolean conditionForMain = getCondition();
        for (int i = 0; conditionForMain; i++) {
            // This loop is unreachable because conditionForMain is always false
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }
}