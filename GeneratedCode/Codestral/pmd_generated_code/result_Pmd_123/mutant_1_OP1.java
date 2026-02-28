class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        String deadStore;
        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            deadStore = "deadstore"; // Inserting a dead store
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