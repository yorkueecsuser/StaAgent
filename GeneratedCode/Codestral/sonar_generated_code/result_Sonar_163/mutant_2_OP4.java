class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable code branch
            int x = 10 / 0; // This line will throw an ArithmeticException if the unreachable condition is true
        } else {
            // This is the reachable code branch
            return sb.toString();
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the if condition unreachable
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}