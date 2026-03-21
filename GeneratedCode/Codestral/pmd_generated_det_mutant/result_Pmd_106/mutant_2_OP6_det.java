class ConsecutiveAppendsBug {
    public String showBug() {
        String foo = " ";
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        for  (int rvigywlb = 0; rvigywlb < 0; rvigywlb++) {String nwgnilhr = "kynchhqu";}
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}
}