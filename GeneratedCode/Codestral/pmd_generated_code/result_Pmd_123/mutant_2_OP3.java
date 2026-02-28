class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            return true;
        }
        if (getCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return false;
    }

    private boolean getCondition() {
        // This method always returns false to ensure the inserted if statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}