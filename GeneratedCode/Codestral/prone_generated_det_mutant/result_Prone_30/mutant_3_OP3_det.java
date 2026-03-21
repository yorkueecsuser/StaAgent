class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (true && true && true && false && false && true && true && false && false && true && false) {byte krnuupat = 1;}
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