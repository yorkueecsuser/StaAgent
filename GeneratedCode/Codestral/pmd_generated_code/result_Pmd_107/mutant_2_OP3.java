class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        if (isConditionMet()) {
            // Unreachable if statement mutant
            if (false) {
                System.out.println("This is an unreachable statement");
            }
        }
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    private boolean isConditionMet() {
        // Implement condition logic
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}