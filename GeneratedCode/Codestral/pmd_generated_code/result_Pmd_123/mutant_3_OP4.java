class StringBufferLengthBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            return true;
        }
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code block inserted due to the mutation operator
            System.out.println("This code block is unreachable in the original program");
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