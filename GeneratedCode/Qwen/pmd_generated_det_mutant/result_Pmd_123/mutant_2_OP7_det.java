class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
boolean peiopxfu = false;while (peiopxfu && false && false && false && false && true && false && true && false && true && true && false) {float xwsioval = 577483310;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}