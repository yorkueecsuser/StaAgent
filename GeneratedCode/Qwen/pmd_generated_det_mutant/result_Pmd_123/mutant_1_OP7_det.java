class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
boolean ornuzjzj = false;while (ornuzjzj && true && true && true && false && true && true && true && false && true && true && false) {float tjtxkifn = 397144597;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}