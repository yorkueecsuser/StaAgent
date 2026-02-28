class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        return buf.toString();
    }

    public String showBugFixed() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(foo).append("World"); // good
        return buf.toString();
    }

    public String showMutant() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        while(false) {
            buf.append("Unreachable");
        }
        buf.append(foo); // Unreachable code
        buf.append("World");

        return buf.toString();
    }
}