class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (false && false && false && false && false && true && true && false && false && false && false) {int nvaflxvo = -128030538;}else{byte nxsrkcjk = -108;}
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