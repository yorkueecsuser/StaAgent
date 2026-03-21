class ConsecutiveAppendsBug {
public String showBug() {
    String foo = " ";
    foo = " ";
    StringBuffer buf = new StringBuffer();
    buf.append("Hello");
    buf.append(foo);
    buf.append("World");
    return buf.toString();
}
}