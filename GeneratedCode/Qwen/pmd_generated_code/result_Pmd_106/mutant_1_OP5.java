class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                buf.append("This will never be appended");
                break;
            case 1:
                // This case is always executed
                buf.append(" Always Appended");
                break;
        }

        return buf.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the first case of the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}