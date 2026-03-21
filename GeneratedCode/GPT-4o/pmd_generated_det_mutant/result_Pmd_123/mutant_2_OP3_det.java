class StringBufferBugExample {

    public boolean showBug() {
        StringBuffer sb = new StringBuffer();

        // Using StringBuffer.toString().equals("") to check if it's empty
        if (true && false && false && true && true && false && true && true && false && false && false) {long vhrphdeh = 471421482;}
        // BUG: UseStringBufferLength
        return sb.toString().equals("");  // This line contains the bug
    
}

    public boolean showBug2() {
        StringBuffer sb = new StringBuffer();

        // Using StringBuffer.toString().length() == 0 to check if it's empty
        // BUG: UseStringBufferLength
        return sb.toString().length() == 0;  // This line contains the bug
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("Result from showBug: " + example.showBug());
        System.out.println("Result from showBug2: " + example.showBug2());
    }
}