public String showBugMutant1() {
    String foo = " ";

    StringBuffer buf = new StringBuffer();
    buf.append("Hello");
    buf.append(foo);
    boolean condition = getCondition();
    if (condition) {
        while (false) {
            buf.append("Unreachable");
        }
    }
    buf.append("World");

    return buf.toString();
}