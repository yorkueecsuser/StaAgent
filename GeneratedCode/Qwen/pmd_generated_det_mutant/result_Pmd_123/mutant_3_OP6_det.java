class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
for  (int grexnbsg = 0; grexnbsg < 0; grexnbsg++) {short hmnohpmp = 1615;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}