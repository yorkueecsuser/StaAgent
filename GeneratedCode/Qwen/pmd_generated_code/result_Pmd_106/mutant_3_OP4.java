class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            buf.append(" This should not be appended");
        } else {
            buf.append(" Nor this");
        }

        return buf.toString();
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}