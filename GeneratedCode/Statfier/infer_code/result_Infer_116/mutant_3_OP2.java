class Example {
    public static boolean hasNotification(MyObject object) {
        boolean result = false;
        if (object == null) {
            result = false;
        } else {
            //... actual logic
            result = true;
        }
        return result;
    }
}