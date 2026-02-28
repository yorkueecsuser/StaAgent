class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            for (int i = 0; getCondition(); i++) { // unreachable for loop
                System.out.println("This line will never be executed");
            }
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false; // condition to make the loop unreachable
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}