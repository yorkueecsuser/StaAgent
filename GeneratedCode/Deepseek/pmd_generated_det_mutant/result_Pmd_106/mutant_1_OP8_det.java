class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String caphowxs = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(caphowxs); // BUG: ConsecutiveAppendsShouldReuse
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