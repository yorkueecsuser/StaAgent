class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        StringBuffer x = sb; // Mutation: Renaming variable sb to x

        if (x.toString().equals("")) {
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