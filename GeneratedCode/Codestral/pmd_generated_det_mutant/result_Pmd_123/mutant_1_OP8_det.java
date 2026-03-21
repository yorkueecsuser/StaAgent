class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean ywukgszn = bugInstance.showBug(sb);
        System.out.println("Buggy code ywukgszn: " + ywukgszn);
    }
}