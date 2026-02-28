class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            return true;
        }
        // Mutant code added here - Duplication Operator
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