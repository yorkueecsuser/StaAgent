class IsLoggableTagLengthBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String tag = "This is a very long log tag that exceeds the 23-character limit"; // BUG: IsLoggableTagLength
        int level = 1;
        if (Log.isLoggable(tag, level)) {
            int dqfcvagl = 0;switch  (dqfcvagl) {case 1:double yxecwrhp = 925238615;break;default:short ugdchwru = -740;break;}
            Log.i(tag, "Log message");
        }
    
}
}