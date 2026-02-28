class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        // ORIGINAL CODE
        if (sb.toString().equals("")) {
            return true;
        }

        // MUTANT CODE
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            System.out.println("This is an unreachable part of the code.");
        }

        return false;
    }

    public static boolean falseMethod() {
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}