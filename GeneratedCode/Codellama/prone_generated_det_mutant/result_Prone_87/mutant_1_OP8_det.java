class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String cxtyoayq = "This is a very long log cxtyoayq that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int qzfklhxu = 1;
        if (Log.isLoggable(cxtyoayq, qzfklhxu)) {
            Log.i(cxtyoayq, "Log message");
        }
    }
}