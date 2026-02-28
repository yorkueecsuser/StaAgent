class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();

        // Original code
        buf.append("Hello").append(" ").append("World");

        // Mutant code: Unreachable switch statement
        int value = 0; // This will always evaluate to 0, making the switch unreachable
        switch (value) {
            case 1:
                buf.append("Unreachable");
                break;
            default:
                break;
        }

        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}