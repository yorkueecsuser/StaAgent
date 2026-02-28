class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This unreachable loop is inserted as per the Mutation Operator
            System.out.println("This line will never be executed.");
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        if (Boolean.FALSE) {
            // This unreachable block is inserted as per the Mutation Operator
            System.out.println("This line will never be executed.");
        }
        return str.charAt(index);
    }
}