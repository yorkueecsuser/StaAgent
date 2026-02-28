class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            return true;
        }
        // MUTANT CODE: Add unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable!");
        } else {
            System.out.println("This else branch is also unreachable!");
        }
        return false;
    }

    // Method to simulate an unreachable condition
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