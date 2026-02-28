class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World");
        buf.append("Hello").append(" ").append("World"); // MUTANT: Duplication of the bug
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}