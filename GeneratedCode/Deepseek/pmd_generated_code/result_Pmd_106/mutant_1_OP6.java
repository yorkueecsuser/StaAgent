class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        // Unreachable For Loop Mutant
        for (int i = 0; false; i++) { // Non-compilable loop condition
            System.out.println("Unreachable");
        }

        return buf.toString();
    }

    public String showBugFixed() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(foo).append("World"); // good
        return buf.toString();
    }
}