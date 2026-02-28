class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello");
        buf.append(foo); // Duplicating this line
        buf.append("Hello"); // Newly added line
        buf.append(foo); // Duplicating this line
        buf.append("World");

        return buf.toString();
    }

    public String showBugFixed() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(foo).append("World");
        return buf.toString();
    }
}