class ConsecutiveLiteralAppendsBug {

    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        if (getCondition()) {
            // Unreachable mutant code
            buf.append("Mutant: This code should never be executed");
        } else {
            buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}