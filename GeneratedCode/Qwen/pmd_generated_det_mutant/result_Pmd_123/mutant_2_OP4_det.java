class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
if (true && true && false && true && false && false && true && false && true && true && false) {boolean qfnvcrzf = true;}else{byte cweqjiil = -65;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}