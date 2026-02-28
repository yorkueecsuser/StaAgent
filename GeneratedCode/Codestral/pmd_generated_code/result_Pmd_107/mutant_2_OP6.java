class ConsecutiveLiteralAppendsBug {

    public boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();

        // Insert unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code");
        }

        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}