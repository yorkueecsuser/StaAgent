class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String bedqaeqa = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(bedqaeqa); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        return buf.toString();
    }

    public String showBugFixed() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(foo).append("World"); // good
        return buf.toString();
    }
}