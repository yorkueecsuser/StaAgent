class ConsecutiveLiteralAppendsBug {

    private static boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends

        // Mutation: Insert unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This code is unreachable.");
        }

        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}