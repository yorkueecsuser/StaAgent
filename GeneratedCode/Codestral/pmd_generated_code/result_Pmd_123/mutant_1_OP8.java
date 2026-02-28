class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // Original Code
        if (sb.toString().equals("")) {
            return true;
        }

        // Mutated Code with Renaming Mutation Operator
        StringBuffer xb = sb;
        if (xb.toString().equals("")) {
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