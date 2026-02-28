class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello");
        buf.append(foo);
        switch(0) { // Mutation: Unreachable switch statement
            case 1: // This switch case will never run, making the code unreachable
                buf.append("DeadCode");
                break;
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