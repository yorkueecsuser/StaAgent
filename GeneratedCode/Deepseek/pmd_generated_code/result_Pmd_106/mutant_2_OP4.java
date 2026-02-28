class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello");
        boolean condition = false;
        if (condition) {
            buf.append(foo);
        } else {
            buf.append("ConsecutiveAppendsShouldReuse"); // Mutant Code: Unreachable If-Else Statement
        }
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