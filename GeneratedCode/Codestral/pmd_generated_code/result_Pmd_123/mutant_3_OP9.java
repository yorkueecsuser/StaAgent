class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // Mutated code with Equivalent Mutation Operator for UseStringBufferLength bug
        if (sb.toString().length() == 0) {
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