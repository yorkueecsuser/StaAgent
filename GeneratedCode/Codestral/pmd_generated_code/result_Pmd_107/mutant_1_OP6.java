class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        // Inserting unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line will never be executed");
        }
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}