class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int fcvzoezo = 0;switch  (fcvzoezo) {case 1:float bxazfyio = -997596410;break;default:char ewsxisjg = 'k';break;}
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            Log.i(tag, "Log message");
        }
    
}
}