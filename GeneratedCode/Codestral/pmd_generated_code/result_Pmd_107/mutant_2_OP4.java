class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World");

        if (getCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This is the else part of the unreachable if-else statement");
        }

        return buf.toString();
    }

    private boolean getCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}