class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        if (sb.toString().equals("")) {
            boolean unreachableCondition = getUnreachableCondition();
            switch(unreachableCondition) {
                case true:
                    System.out.println("Unreachable code block");
                    break;
            }
            return true;
        }
        return false;
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}