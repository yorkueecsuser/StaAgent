class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        buf.append("Hello").append(" ").append("World"); // Duplicated statement
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}