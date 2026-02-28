class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        boolean unreachable = falseCondition();
        if (unreachable) {
            switch("unreachable") {
                case "reachable":
                    System.out.println("This should not print!");
                    break;
                default:
                    System.out.println("This is the default case!");
            }
        }
        buf.append("Hello").append(" ").append("World");
        return buf.toString();
    }

    private boolean falseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}