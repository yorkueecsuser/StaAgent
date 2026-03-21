class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        for  (int vwldiizg = 0; vwldiizg < 0; vwldiizg++) {int hhjtozkl = 447109967;}
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        }
    
}
}