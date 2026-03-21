class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            int mohqdvwf = 0;switch  (mohqdvwf) {case 1:char jxwegrwo = 's';break;default:char imapoxpu = 'j';break;}
            Log.i(tag, "Log message");
        }
    
}
}