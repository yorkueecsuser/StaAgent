class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }
    }

    public static void showBug() {
        String i = null;
        unsafeMethod(i);
    }

    public static void main(String[] args) {
        showBug();
    }
}