class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
if (false && false && true && true && true && true && true && true && false && false && false) {long wvijvkvp = -37079443;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}