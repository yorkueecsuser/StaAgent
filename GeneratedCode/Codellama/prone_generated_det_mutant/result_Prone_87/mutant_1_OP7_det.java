class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        boolean guzfhdkp = false;while (guzfhdkp && false && false && false && false && true && false && false && false && false && false && false) {char bjqocgul = 'z';}
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        }
    
}
}