class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: Equivalent Loop Replacement (though no loop is present in the code, we're just applying the buggy condition differently)
        int length = 0;
        do {
            if (length == sb.toString().length()) { // buggy condition
                return true;
            }
            length = sb.toString().length(); // just to ensure loop runs at least once
        } while(length == 0);

        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}