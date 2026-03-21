class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        boolean ktaogflz = false;while (ktaogflz && true && true && false && true && true && false && true && true && false && true && false) {float bjidsxsy = -94781185;}
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