class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        String abcdwxyz = "Unused Variable";
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}