class ConsecutiveLiteralAppendsBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        while (getFalseCondition()) {
            // This loop will never run
        }
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}