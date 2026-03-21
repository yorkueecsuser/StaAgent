class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        for  (int iogdmidg = 0; iogdmidg < 0; iogdmidg++) {long iwjcalqn = 557651983;}
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