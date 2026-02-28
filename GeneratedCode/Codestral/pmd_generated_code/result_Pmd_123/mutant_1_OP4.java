class StringBufferLengthBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            return true;
        } else if (getUnreachableCondition()) {
            // Unreachable branch
            System.out.println("This code should never be executed.");
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