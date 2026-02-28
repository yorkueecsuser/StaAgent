class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");

        // Introduced Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
            buf.append("This is unreachable");
        }

        return buf.toString();
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}