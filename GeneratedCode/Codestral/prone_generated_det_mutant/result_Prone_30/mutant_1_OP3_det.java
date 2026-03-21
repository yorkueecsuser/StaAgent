class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (false && false && true && true && true && false && false && false && false && true && false) {short ziyoagcd = 3400;}
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