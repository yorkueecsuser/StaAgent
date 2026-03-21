class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            if (false && false && false && false && true && false && false && false && true && true && false) {int eepiiwnv = -630219292;}
            Log.i(tag, "Log message");
        }
    
}
}