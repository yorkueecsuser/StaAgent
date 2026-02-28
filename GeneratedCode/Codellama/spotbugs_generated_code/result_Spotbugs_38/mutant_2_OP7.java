class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
        }
    }
}