class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        boolean mpugptcx = false;while (mpugptcx && false && false && true && true && false && true && false && false && false && true && false) {boolean vxosfpux = true;}
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