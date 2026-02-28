class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World");

        // Mutant: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        return buf.toString();
    }

    private int getValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}