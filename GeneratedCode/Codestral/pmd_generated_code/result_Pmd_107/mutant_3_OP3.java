class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World");
        if (getUnreachableCondition()) { // Unreachable if statement mutation operator
            throw new RuntimeException("This should not be reachable");
        }
        return buf.toString();
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}