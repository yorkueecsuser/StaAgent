class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        for  (int sobkiolw = 0; sobkiolw < 0; sobkiolw++) {double tebsrvpb = -687461724;}
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