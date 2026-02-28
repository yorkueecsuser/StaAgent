class ConsecutiveLiteralAppendsBug {

    public boolean getCondition() {
        return false; // always returns false to make the loop unreachable
    }

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        for(int i = 0; getCondition(); i++) { // inserting unreachable for loop
            // this block of code is unreachable
            System.out.println("Unreachable code");
        }
        buf.append("Hello").append(" ").append("World");
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}