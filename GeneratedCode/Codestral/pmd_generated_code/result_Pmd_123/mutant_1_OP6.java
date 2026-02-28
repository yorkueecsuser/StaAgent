class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This code will never be executed");
        }
        // BUG: UseStringBufferLength
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