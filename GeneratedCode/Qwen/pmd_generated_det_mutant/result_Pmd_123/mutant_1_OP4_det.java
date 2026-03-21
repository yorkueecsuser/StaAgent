class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
if (false && false && false && true && true && false && false && false && true && true && false) {byte cesfndet = 29;}else{float uupwxirw = -419118162;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}