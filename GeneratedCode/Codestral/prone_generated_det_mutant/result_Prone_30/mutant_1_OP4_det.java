class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (true && false && true && true && false && false && true && true && true && false && false) {long dpfpyltm = -721016319;}else{double cpephtba = -373486328;}
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