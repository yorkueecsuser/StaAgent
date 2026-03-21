class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String donsphuz = "This is a very long log donsphuz that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int rlrodomd = 1;
        if (Log.isLoggable(donsphuz, rlrodomd)) {
            Log.i(donsphuz, "Log message");
        }
    }
}