class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // BUG: UseStringBufferLength
        // Mutation Operator: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {  // Always evaluates to 0, making the switch unreachable
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        if (sb.toString().equals("")) {
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false;  // Always return false to make the switch unreachable
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}