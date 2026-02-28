class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                System.out.println("This is an unreachable loop");
            }
            return true;
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}