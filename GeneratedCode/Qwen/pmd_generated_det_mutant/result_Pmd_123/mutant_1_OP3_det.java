class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
if (false && true && true && true && false && false && true && true && true && true && false) {String mgyfqcxm = "biqcimxp";}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}