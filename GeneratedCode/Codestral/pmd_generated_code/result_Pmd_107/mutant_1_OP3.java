class ConsecutiveLiteralAppendsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        }
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}