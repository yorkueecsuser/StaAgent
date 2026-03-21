class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        int shnkckqr = 0;switch  (shnkckqr) {case 1:boolean pgzxmukx = false;break;default:boolean fydfjhsp = true;break;}
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