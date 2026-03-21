class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String xajcpise = "This is a very long log xajcpise that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int pmjyhqcm = 1;
        if (Log.isLoggable(xajcpise, pmjyhqcm)) {
            Log.i(xajcpise, "Log message");
        }
    }
}