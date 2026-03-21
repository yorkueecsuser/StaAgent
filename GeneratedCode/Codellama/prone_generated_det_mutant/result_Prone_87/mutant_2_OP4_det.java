class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        if (false && true && true && false && true && true && false && true && false && true && false) {int wiomyrtw = -814837140;}else{double diyelxdo = -280940189;}
        }
    
}
}