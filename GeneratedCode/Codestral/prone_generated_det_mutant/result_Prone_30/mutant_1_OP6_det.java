class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        for  (int cvsevkba = 0; cvsevkba < 0; cvsevkba++) {float wkxogwey = 315880445;}
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }
    
}

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}