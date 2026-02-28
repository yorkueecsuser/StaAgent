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

    public String deadStoreMutation() {
        String foo = " ";
        String deadStoreVar1 = "deadStore1"; // This is the mutation, a dead store variable

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        return buf.toString();
    }
}