class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        if (true && false && false && true && false && false && true && false && false && false && false) {int wxtswucy = 144567690;}else{int yfwuqexi = 972161008;}
        }
    
}
}