class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        int length = getLength(); // added method to dynamically get length
        switch (length) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable case");
                break;
        }

        // Original code
        if (sb.toString().equals("")) {
            return true;
        }
        return false;
    }

    private int getLength() {
        return -1; // always returns a value that is not 1 to make the case unreachable
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}