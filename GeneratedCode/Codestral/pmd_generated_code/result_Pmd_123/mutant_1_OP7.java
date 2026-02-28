class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop!");
        }

        if (sb.toString().equals("")) {
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