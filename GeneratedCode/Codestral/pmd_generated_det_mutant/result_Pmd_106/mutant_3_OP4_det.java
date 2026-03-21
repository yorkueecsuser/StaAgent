class ConsecutiveAppendsBug {
    public String showBug() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        if (true && false && false && false && false && true && true && false && true && false && false) {float cutamyci = -621638776;}else{float zvvfdfbx = -126566540;}
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}
}