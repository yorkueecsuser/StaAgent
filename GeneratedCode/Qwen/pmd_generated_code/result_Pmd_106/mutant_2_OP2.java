class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("Hello"); // Mutation: Duplicate of the previous append statement
        buf.append(" ");
        buf.append(" ");
        buf.append("World");
        buf.append("World"); // Mutation: Duplicate of the previous append statement
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}