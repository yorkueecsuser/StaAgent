class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        boolean yhdktidp = false;while (yhdktidp && true && false && false && true && true && false && true && true && true && true && false) {boolean nzvksdvo = true;}
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