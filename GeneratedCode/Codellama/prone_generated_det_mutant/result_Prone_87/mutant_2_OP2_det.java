class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String tag = "This is a very long log tag that exceeds the 23-character limit";
    tag = "This is a very long log tag that exceeds the 23-character limit";
    int level = 1;
    if(Log.isLoggable(tag , level)) { Log.i(tag , "Log message"); }
}
}