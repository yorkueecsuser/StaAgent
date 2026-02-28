class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // Insert a dead store variable here
        int deadStoreVariable = 10;

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