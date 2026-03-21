class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        if (false && false && false && false && true && true && true && true && false && false && false) {long ymlvtoyq = 968450656;}else{boolean cnrzttty = false;}
        }
    
}
}