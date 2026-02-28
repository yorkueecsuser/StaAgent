class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                buf.append("This is unreachable");
                break;
            case 1:
                // This is the only reachable case
                break;
        }

        return buf.toString();
    }

    private boolean getCondition() {
        // This method returns false, making the first case in the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}