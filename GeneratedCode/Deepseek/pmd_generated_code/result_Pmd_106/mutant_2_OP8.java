class ConsecutiveAppendsShouldReuseBug {
    String foo = " ";

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        return buf.toString();
    }

    public String showBugFixed() {
        String bar = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(bar).append("World"); // good
        return buf.toString();
    }
}