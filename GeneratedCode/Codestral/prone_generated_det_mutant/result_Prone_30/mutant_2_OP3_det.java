class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (false && true && true && true && true && false && false && true && false && false && false) {short yvegpxnm = 1613;}
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