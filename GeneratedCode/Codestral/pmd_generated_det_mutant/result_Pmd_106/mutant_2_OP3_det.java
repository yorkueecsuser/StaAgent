class ConsecutiveAppendsBug {
    public String showBug() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        if (false && true && false && false && false && false && false && true && true && true && false) {boolean ppnmxcil = false;}
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}
}