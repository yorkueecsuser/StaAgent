class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public void unreachableForLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code should never be reached");
        }
    }
}