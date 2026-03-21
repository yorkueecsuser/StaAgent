class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        byte dvtmlmky = 82;
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
}