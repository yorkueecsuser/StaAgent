class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (true && true && false && true && true && false && false && true && false && false && false) {String ldwrthmb = "bawujlqr";}else{String jrfxydlp = "forhmegk";}
        if (sb.toString().equals("")) {
            return true;
        }
        return false;
    
}

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}