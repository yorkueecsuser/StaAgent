class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        boolean egjaawln = false;while (egjaawln && true && true && false && false && false && true && true && false && true && true && false) {char xxetgqay = 'v';}
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        }
    
}
}