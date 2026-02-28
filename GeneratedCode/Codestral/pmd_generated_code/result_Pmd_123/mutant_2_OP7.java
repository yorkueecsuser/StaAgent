class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable
            }
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}