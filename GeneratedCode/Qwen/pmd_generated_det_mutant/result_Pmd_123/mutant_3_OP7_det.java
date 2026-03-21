class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
boolean ugmuqxmf = false;while (ugmuqxmf && true && true && false && true && false && true && false && true && false && true && false) {long gvvxnsyi = 409312747;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}