class ConsecutiveLiteralAppendsBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        while (getUnreachableCondition()) {
            // Unreachable while loop mutant
        }
        buf.append("Hello").append(" ").append("World"); // Original code remains
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}