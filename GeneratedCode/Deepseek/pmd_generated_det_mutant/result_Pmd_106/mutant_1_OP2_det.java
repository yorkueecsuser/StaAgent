class ConsecutiveAppendsShouldReuseBug {
public String showBug() {
    String foo = " ";
    foo = " ";
    StringBuffer buf = new StringBuffer();
    buf.append("Hello");
    buf.append(foo);
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