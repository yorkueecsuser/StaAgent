class StringBufferLengthBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            return true;
        }

        // Mutation: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This branch is unreachable.");
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