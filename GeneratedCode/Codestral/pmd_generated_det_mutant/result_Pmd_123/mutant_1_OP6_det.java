class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        for  (int nwauhndr = 0; nwauhndr < 0; nwauhndr++) {char dvufptnf = 'z';}
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