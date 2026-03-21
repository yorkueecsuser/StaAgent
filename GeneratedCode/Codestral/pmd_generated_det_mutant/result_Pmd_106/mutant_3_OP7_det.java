class ConsecutiveAppendsBug {
    public String showBug() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        boolean xyrubqdu = false;while (xyrubqdu && false && false && true && false && false && true && true && true && false && false && false) {double qgpwpufm = -721530302;}
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}
}